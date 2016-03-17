val imgFilenames = new java.io.File(".")
	.listFiles()
	.map(_.getName())
	.filter(e=>(!e.endsWith(".scala")&& !e.endsWith("preview.html")))
	.filter(e=>(!Set("vig_notebook.jpg", "vig_alert.jpg").contains(e)))


def createDiv(filename : String) = {
	val width = javax.imageio.ImageIO.read(new java.io.File("./" + filename)).getWidth()
	val height = javax.imageio.ImageIO.read(new java.io.File("./" + filename)).getHeight()
	val desc = filename + "(" + width + "x" + height + ")"

	if (width == height && width == 1) {
		s"<div>TODO 1x1 px $desc</div>"
	} else if (width == 1) {
		"""<div>""" + desc + """<div style="height: """ + height + """px; width: 200px; background:url('""" + filename + """') repeat-x;" ></div></div>"""
	} else if (height == 1) {
		"""<div>""" + desc + """<div style="height: 20px; width: $(width)px; background:url('$filename') repeat-x;" ></div></div>"""
	} else {
		s"<div>$desc<img src='$filename'/></div>"
	}
}

val divs = imgFilenames
	// .filter(!_.startsWith("bg_"))
	// .filter(_.startsWith("bg_"))
	.map(createDiv(_))
	.toList
	.mkString("\r\n")

println(s"""
<html>
<head>
	<title></title>
	<style type="text/css"><!--
		img {
			background: red;
		}

		body > div {			
			/*background: grey;*/
			border: solid black 1px;
			float:left;
			clear: left;
			margin-top:20px;
		}-->
	</style>
</head>
<body>
$divs

</body>
</html>""")