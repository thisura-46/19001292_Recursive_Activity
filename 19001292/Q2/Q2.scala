object Prime extends App {

  def prime(n:Int, m:Int=2):Boolean = n match {
    case x1 if(n == m) => true
    case x2 if(n % m == 0) => false
    case _ => prime(n, m+1)
  }
  def primeSeq(n:Int, m:Int=2):Unit = {
    if (prime(m)) println(m)
    if (n == m) return

    primeSeq(n, m+1)
  }
  primeSeq(10)
}
