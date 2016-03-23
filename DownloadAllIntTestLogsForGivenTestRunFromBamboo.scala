/*
Downloads logs for a given bamboo test plan.

plan page:
http://BAMBOO_HOST/browse/TESTSUITE02-1016/log

log page:
http://BAMBOO_HOST/download/TESTSUITE02/build_logs/TESTSUITE02-1016.log
http://BAMBOO_HOST/download/TESTSUITE68/build_logs/TESTSUITE68-1016.log
													  ^^^^^^^^^^^            ^^^^^^^^^^^

*/

val BAMBOO_HOST = "BAMBOO_HOST";
val TESTSUITE = "TESTSUITE";

  def downloadLog(url: String): Option[Iterator[String]] = {
    try {
      //println("Downloading " + url);
      return Some(scala.io.Source.fromURL(url, "utf-8").getLines)
    } catch {
      case e: Throwable => { e.printStackTrace(); }
    }
    return None
  }

def downloadLogToFile(testSuiteNumber : String, buildNumber : String) {
	val filename = """TESTSUITE""" + testSuiteNumber + """-""" + buildNumber + """.log"""
	val url = """http://""" + BAMBOO_HOST + """/download/""" + TESTSUITE + testSuiteNumber + """/build_logs/""" + filename
	val log1 = downloadLog(url)  
	scala.tools.nsc.io.File(filename).writeAll(log1.get.mkString("\r\n"))
}

(1 to 73).map(e=>if(e<10) "0" + e else e+"").foreach(e=>downloadLogToFile(e, "1016"))
