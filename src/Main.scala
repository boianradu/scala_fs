object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val p=new Point(1,13)
    val ro = new Romanian("Giani", 0, "gipsy")
    ro.printComponents()
  }

  def testAssert (): Unit = {
    val left=1
    val right=2
    assert(left==right)
  }
}