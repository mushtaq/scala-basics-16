package data

case class Address(street: String, pin: Int)

object Address {}

case class Person(name: String, address: Address)

object Person {}

case class Book(
    author: String,
    title: String,
    basePrice: Double
)

object Book {}

object Data {

  val books = List(
    Book("odersky", "scala prog", 100),
    Book("odersky", "apple", 100),
    Book("odersky", "complexity", 400),
    Book("minsky", "ocaml prog", 1000),
    Book("minsky", "sml", 88),
    Book("hickey", "clojure prog", 500)
  )

  val books2 = List(
    Some(Book("odersky", "scala prog", 100)),
    None,
    Some(Book("minsky", "sml", 88))
  )

  val people = List(
    Person("mushtaq", Address("baner", 123)),
    Person("ajit", Address("pashan", 100))
  )
}
