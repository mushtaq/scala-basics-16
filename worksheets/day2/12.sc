class Person(val name: String, val age: Int)

val p = new Person("mushtaq", 25)
val p2 = new Person("mushtaq", 25)
val p3 = new Person("anand", 35)

p.name
p.age

p == p2
p == p3

p.hashCode()
p2.hashCode()
p3.hashCode()