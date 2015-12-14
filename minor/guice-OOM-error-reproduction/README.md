Following steps allows to reproduce OutOfMemoryError error: 
* checkout branch with generated sources - 'generated-code-1'
* execute: `mvn exec:java -Dexec.mainClass="Main"`
* the JVM process will stop after about 2 minutes (depends on the machine speed). It will be caused by the exception - `java.lang.OutOfMemoryError: Java heap space`

