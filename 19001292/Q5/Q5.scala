object EvenSum extends App {

  def evenSum(n:Int, i:Int=2):Int = {
    if (n <= i) return 0
    return i + evenSum(n, i+2)
  }
  println(evenSum(7))
}