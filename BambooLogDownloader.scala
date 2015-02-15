object BambooLogDownloader {
  def main(args: Array[String]) = {
    if (args.length != 4) throw new IllegalArgumentException("""Expecting two arguments: BAMBOO_LOG_DOWNLOAD_URL and JOB_ID. For example "http://bamboo.mybamboooo.com/download/ MY-JOB1 61771 61773" """);
    val bambooLogDownloadUrl = args(0)
    val jobId = args(1)
    val firstId = args(2).toInt
    val lastId = args(3).toInt
    val results = (firstId to lastId).map(getBuildInfo(_, bambooLogDownloadUrl, jobId)).mkString("\n")
  }

  def downloadLog(url: String): Option[Iterator[String]] = {
    try {
      //println("Downloading " + url);
      return Some(scala.io.Source.fromURL(url, "utf-8").getLines)
    } catch {
      case e: Throwable => { e.printStackTrace(); }
    }
    return None
  }

  def getBuildInfo(buildId: Integer, bambooUrl: String, jobId: String) = {
    val url = bambooUrl + jobId + "/build_logs/" + jobId + "-" + buildId + ".log"
    downloadLog(url) match {
      case Some(contentIter) =>
        val lineWithHost = contentIter.next
        val buildSuccessfull = contentIter.filter(e => e.contains("build failed, running fail command") || e.contains("build was successful, running success command") || e.contains("Failed to prepare the build")).next.contains("successful")
        var color = if (buildSuccessfull) "green" else "red"
        var res = "{color:" + color + "}" + lineWithHost + "{color}"
        println(res)
        res
      case None =>
        println("Could not get log file for buildId=" + buildId)
    }
  }

  def extractMetadata(str: String) = {
    val Line = """simple (.*)  Build (.*) started building on agent ([\w\.]*)""".r
    val Line(date, buildId, agentName) = str
    (date, buildId, agentName)
  }
  assert(
    extractMetadata("simple 09-Feb-2015 20:58:40  Build MY-JOB1-99999 started building on agent my.url.co.uk") ==
      ("09-Feb-2015 20:58:40", "MY-JOB1-99999", "my.url.co.uk"))
}

