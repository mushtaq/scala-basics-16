
case class Person(name: String, age: Int) {

}

val p = Person("mushtaq", 25)
val p2 = Person.apply("mushtaq", 25)
val p3 = Person("anand", 35)

p.name
p.age

p == p2
p == p3

p.hashCode()
p2.hashCode()
p3.hashCode()

Person(p.name, 30)

p.copy(age = 30)