package com.particeep.test
import java.util.regex.Pattern

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = {
    var url = "?"
    var keys = params.keys.toArray
    var values = params.values.toArray

    var i = 0

    while(i < keys.length) {
      url = url + keys(i) + "=" + values(i)
      if(i < keys.length - 1) url = url + "&"
      i = i + 1
    }
    url
  }


  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean = {
     if("([\\w-\\.]{5,32}+)@([\\w]{2,}(\\.[\\w]{2,})+)".r.findFirstIn(maybeEmail) == None) false
     else true 
  }

  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
    if(n == 0) 1
    else if(n == 1) i
    else i*power(i, n-1)
  }

  def main(args: Array[String]): Unit = {
    println(encodeParamsInUrl(Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")))
    println(power(2,3))
    println(isEmail("testscala@gmail.com")) 
    /*println(isEmail("te.stt@gmail.com.vn")) 
    println(isEmail("tes-9t0@gmail.com"))                         
    println(isEmail("t es tt@gmail.com")) 
    println(isEmail("testt@gmail.com"))                       
    println(isEmail("testt@g.com"))  
    println(isEmail("testt@gmail.c")) 
    println(isEmail("testt@gma.i.l.c.o.m"))                   
    println(isEmail("testt@gmailcom"))*/     
  }
}
