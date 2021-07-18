object EvenOrOdd extends App {

  def isEven(n:Int):Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n:Int):Boolean = {
    !isEven(n)
  }
  println ("7 is even = " + isEven(7))
  println ("8 is odd = " +isOdd(8))
  println ("6 is even = " + isEven(6))
  println ("5 is odd = " +isOdd(5))

}