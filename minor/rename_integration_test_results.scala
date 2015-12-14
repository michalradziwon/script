//converts name of all files in the current dir. Leaves the id and removes all the other characters.
//for example:
//00001-153249-037-setTimeout.png
//to
//00001-153249-037-setTimeout.png
new java.io.File(".").listFiles().foreach(e=>e.renameTo(new java.io.File("./" + e.getPath().take(7)+".png")))