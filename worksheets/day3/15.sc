
class Person(val name: String, val age: Int) {
//  def this(x: Int) = this("default", x)
  def apply(random: Int): String = s"Hello $name and $random"
}
object Person {
  def apply(name: String, age: Int): Person = new Person(name, age)
  def apply(age: Int): Person = new Person("default", age)
}

val p: Person = Person("mushtaq", 45)
val p = Person.apply("mushtaq", 45)

p.name
p.age

p.apply(13)
p(13)

val map = Map(1 -> "a", 2 -> "b")
val map = Map.apply(1 -> "a", 2 -> "b")

map(1)
map.apply(1)