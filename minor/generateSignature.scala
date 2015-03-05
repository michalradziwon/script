def createMethodSignatureWithNParams(name : String, paramsCount : Int)={
	"@Inject public void " + name + "(" + (1 to paramsCount).map(e=>"N n"+ e).mkString(",\n") + "){}"
}


val m = createMethodSignatureWithNParams("method", 50)
println(m)