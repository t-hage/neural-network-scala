package net.thage

object App {
  
  def foo(x : Array[String]): String = x.foldLeft("")((a, b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
