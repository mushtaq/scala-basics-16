
case class Address(pin: Int)
case class Person(name: String, age: Int, address: Address)

val p = Person.apply("mushtaq", 55, Address.apply(411021))
val Some((a, b, c)) = Person.unapply(p)


val person = Person("mushtaq", 55, Address(411021))
val Person(name, age, address) = person
val Person(_, age, Address(pin)) = person



age + age

pin * pin