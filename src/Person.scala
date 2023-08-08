abstract class Person(val name: String, var budget: Int) {
  var age = 0
  private val Home = System.getProperty("user.home")

  override def toString: String = {
    "Name:" + name +
      "\n" + "Budget:" + budget +
      "\n" + "Age:" + age
  }

  def printComponents(): Unit = {
    println(toString())
  }
}

class Romanian(name: String,
               budget: Int,
               val race: String
              ) extends Person(name, budget) {
  override def printComponents(): Unit = {
    super.printComponents()
    println("And race is:", race)
  }
}
