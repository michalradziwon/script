class MyStringList(val s: String) {
  def toLineSet = s.split("\r\n").filter(_.size > 0).map(_.toLowerCase).toSet
}
implicit def stringToString(s: String) = new MyStringList(s)


val list1 = """
a
B
cc""".toLineSet

val list2 = """
b
zzz
""".toLineSet

var list3 = """
xx
b
""".toLineSet


def sortAndPrint(s : Set[String]) = {s.toList.sortWith(_ < _).foreach(println(_));"\n\n"}
println("IN list1 but not in list2:"); sortAndPrint(list1 -- list2)
println("IN list2 but not in list1:"); sortAndPrint(list2 -- list1)
println("IN list1 but not in list3:"); sortAndPrint(list1 -- list3)
println("IN list3 but not in list1:"); sortAndPrint(list3 -- list1)
println("IN list2 but not in list3:"); sortAndPrint(list2 -- list3)
println("IN list3 but not in list2:"); sortAndPrint(list3 -- list2)