// configuration - project's root dir
val path = """/project"""

import scala.io.Source
import java.io.File
def recursiveListFiles(f: File): Array[File] = {
  val these = f.listFiles
  these ++ these.filter(_.isDirectory).flatMap(recursiveListFiles)
}

val start = java.lang.System.currentTimeMillis
val allFiles = recursiveListFiles(new File(path));
val stop = java.lang.System.currentTimeMillis
val diff = stop - start
println(s"all directories crawled after ${diff/1000} seconds")
println("allFiles=" + allFiles.size)
val messageFiles = allFiles.filter(_.getAbsolutePath().endsWith("\\message.properties"))
println("messageFiles=" + messageFiles.size)


val messageFilePaths = messageFiles.map(_.getAbsolutePath)

val start2 = java.lang.System.currentTimeMillis
val messageFilePathWithContents = messageFilePaths.map(path=>(path, Source.fromFile(path).getLines.toList))
val stop2 = java.lang.System.currentTimeMillis
println(s"all files loaded after ${(stop2-start2)/1000} seconds")


val allLinesCount = messageFilePathWithContents.map((_._2.size)).sum
println(s"There is ${allLinesCount} lines in ${messageFilePathWithContents.size} files, average there is ${allLinesCount/messageFilePathWithContents.size} lines per file")


val (messageFilePathWithRawDefinitions, messageFilesWithoutDefinitions) = messageFilePathWithContents.map(e=>(e._1,e._2.filter(e=>(!e.startsWith("#") && e.contains("="))))).partition(_._2.size > 0)

val definitionsCount = messageFilePathWithRawDefinitions.map((_._2.size)).sum
println(s"There is ${definitionsCount} lines in ${messageFilePathWithRawDefinitions.size} files, average there is ${definitionsCount/messageFilePathWithRawDefinitions.size} lines per file")


println(s"\nThere is ${messageFilesWithoutDefinitions.size} files without any valid message definitions:\n")
val PRINT_FILE_WITHOUT_DEFINITIONS_CONTENT = true
messageFilesWithoutDefinitions.foreach(file=>println("\t\t" + (file._1) + (if(PRINT_FILE_WITHOUT_DEFINITIONS_CONTENT) {":\n" + Source.fromFile(file._1).getLines.mkString + "\n\n"})))
println("########################################")



// structure:
// file->(name, List(string:line))
// Array[(String, List[(String, String)])]


def splitLine(s : String) = {
	val Line = "([^=]+)=(.*)".r
	val Line(key, value) = s
	(key, value)
}

val messageFilePathWithDefinitions = messageFilePathWithRawDefinitions.map(e=>(e._1, e._2.map(splitLine(_))))

// flatten the structure Array[(String, List[(String, String)])] -> List[(String, String, String)]  file,key,val
val fileKeyValueEntries = messageFilePathWithDefinitions.map(e=>e._2.map(f=>(e._1,f._1, f._2))).flatten.toList


// now time for analysis:

val byKey = fileKeyValueEntries.groupBy(_._2)
val byValue = fileKeyValueEntries.groupBy(_._3)

println(s"There is ${fileKeyValueEntries.size} analysed entries")
println(s"There is ${byKey.size} unique keys")
println(s"There is ${byValue.size} unique values")


// List[(String, Int, List[(String, String, String)])]  descending
val mostFrequentValues = byValue.map {case (k, v) => (k, v.size, v)}.toList.sortWith(_._2 > _._2)

println("TOP30 most frequent values:\n")
mostFrequentValues.take(30).foreach(e=>println(e._1 + ":" + e._2))