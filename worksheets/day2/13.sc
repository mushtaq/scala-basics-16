
sealed trait Day {
//  Day.staticMethod()
}

object Day {
  case object Weekday extends Day
  case object Weekend extends Day

  private def staticMethod() = 100

  val x = "abc"
}

Day.x

////////////////

class Person(val name: String)

val p = new Person("mushtaq")

val p2 = new Person("mushtaq")

object p3 extends Person("mushtaq") {
  def m() = 109

}

p2.name
p3.name
p3.m()
