package data

import play.api.libs.json.{JsNull, JsValue, Json}
import tc.app.Book

case class Address(street: String, pin: Int)

object Address {}

case class Person(name: String, address: Address)

object Person {}

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

  val json: JsValue = Json.obj(
    "a" -> 10,
    "b" -> true,
    "d" -> "urn:world",
    "d1" -> "world",
    "c" -> JsNull,
    "e" -> Json.obj(
      "f" -> 20,
      "g" -> false,
      "h" -> "hello",
      "i" -> List("urn:pune", "this", "is", ""),
      "i2" -> List(9, 7)
    ),
    "j" -> List(
      Json.obj("k" -> "urn:tw", "l" -> "munich"),
      Json.obj("k" -> "autoscout", "l" -> "urn:germany")
    ),
    "m" -> 90,
    "n" -> "urn:ignore"
  )
}
