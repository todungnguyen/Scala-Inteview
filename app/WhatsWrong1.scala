package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String
  }

  case object Supporter extends Interface {
    override val city = "Paris"
    override val support = s"Ici c'est $city !"
  }

  Supporter.city    //What does this print ? 
  		              //Paris
  Supporter.support //What does this print and why ? How to fix it ? 
  		              //This print "Ici c'est null !" because it took value of $city in line 6, not in line 11
  		              //To fix it, we can do like line 13, get value of city only after creating it
}
