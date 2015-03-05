import java.io._

val FILE_SIZE_GB = 1

for(f <- 1 to 10 * FILE_SIZE_GB){
	println(new java.util.Date + " #" + f)
	val w = new BufferedWriter(new FileWriter(new File(".").getAbsolutePath() + f+  "_.tmp"))
	for(a <- 1 to 102 * 1024 * 1024) w.write(a%10);
}

println("Generation finished" + new java.util.Date)

// slow version with random data!!!
// Stream.continually(util.Random.nextInt(255).toChar).take(1024*1024*1024).foreach(print(_))