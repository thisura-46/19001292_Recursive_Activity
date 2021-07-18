object Fibonacci extends App {

  def fibonacci(n:Int):Int = n matchc{
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n-1) + fibonacci(n-2)
  }
  def fiboSeq(n:Int):Any = {
    if(n > 0) fiboSeq(n-1)
    println (fibonacci(n))
  }
  fiboSeq(10)
}