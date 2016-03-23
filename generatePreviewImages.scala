val imgFilenames = new java.io.File(".")
	.listFiles()
	.map(_.getName())
	.filter(e=>(!e.endsWith(".scala")&& !e.endsWith(".html") && !e.endsWith(".xcf")))
	.filter(e=>(!Set("vig_notebook.jpg", "vig_alert.jpg").contains(e)))


def createDiv(filename : String) = {
	val width = javax.imageio.ImageIO.read(new java.io.File("./" + filename)).getWidth()
	val height = javax.imageio.ImageIO.read(new java.io.File("./" + filename)).getHeight()
	val desc = filename + "(" + width + "x" + height + ")"

	if (width == height && width == 1) {
		s"<div>TODO 1x1 px $desc</div>"
	} else if (width == 1) {
		"""<div>""" + desc + """ horizontal<div class="divWithBackground" style="height: """ + height + """px; width: 200px; background-image: url('""" + filename + """') ;" ></div></div>""" // TODO what with repeat-x
	} else if (height == 1) {
		"""<div>""" + desc + """ vertical<div class="divWithBackground" style="height: 20px; width: $(width)px; background-image: url('$filename') ;" ></div></div>"""// TODO what with repeat-x
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
			background: green;
		}

		body > div {			
			/*background: grey;*/
			border: solid black 1px;
			float:left;
			clear: left;
			margin-top:20px;
		}

		div.picker {
			position: fixed;
		    top: 1em;
		    right: 1em;
		}
		-->

	</style>
	<script type="text/javascript">
	onColorChange = function(color) {
	    style = document.createElement('style');

	    var imgCss = 'img { background: ' + color + '; }'; // for images
	    var divCss = 'div.divWithBackground { background-color: ' + color + '; }'; // for div with background
	    var css = imgCss + "\\n" + divCss;


		style.type = 'text/css';
		if (style.styleSheet){
		  style.styleSheet.cssText = css;
		} else {
		  style.appendChild(document.createTextNode(css));
		}

		document.getElementsByTagName('head')[0].appendChild(style);
	}	
	</script>
</head>
<body>
<div class="picker">
	<div>Img background:<input value="custom" oninput="onColorChange(this.value);"></input></div>
	<div>
		<input type="radio" name="group1" value="green" onchange="onColorChange(this.value);">green</input><br>
		<input type="radio" name="group1" value="#650360" checked onchange="onColorChange(this.value);">#650360 (A)</input></div>
		<input type="radio" name="group1" value="#236fbd" checked onchange="onColorChange(this.value);">#236fbd (vanilla)</input></div>
</div>
$divs

</body>
</html>""")