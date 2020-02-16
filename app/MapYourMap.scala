package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  val namesInDepartments:Map[String, List[String]] = {
  	var map = scala.collection.immutable.Map[String, List[String]]()
  	for((kDept, vDept) <- devDepartments) {
  		for((kName, vName) <- devNames if kName == kDept) 
  			yield {
  				if(!map.contains(vDept)) map += (vDept -> List(vName))
  				else map(vDept) = vName :: map(vDept)
  			}
  	} 
  	map
  }

  def main(args: Array[String]):Unit = {
    println(namesInDepartments)
  }
}
