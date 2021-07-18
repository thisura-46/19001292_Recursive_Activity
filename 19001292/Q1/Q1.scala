object Prime extends App {

  def prime (n:Int, m:Int=2):Boolean = n match {
    case x1 if(n == m) => true
    case x2 if(n % m == 0) => false
    case _ => prime(n,m+1)
  }
  println(prime(5))
  println(prime(8))
}