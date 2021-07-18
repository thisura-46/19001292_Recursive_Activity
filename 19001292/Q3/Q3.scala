object Sum extends App {

  def sum(n: Int):Int = n match {
    case 1 => 1
    case _ => sum(n-1) + n

  }
  println(sum(5))

}