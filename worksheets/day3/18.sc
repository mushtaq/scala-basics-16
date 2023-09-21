{
  sealed trait Option[+T]
  case object None         extends Option[Nothing]
  case class Some[T](x: T) extends Option[T]
}

val map = Map(1 -> "a", 2 -> "b")

map(1)
map(2)

val maybeString: Option[String] = map.get(1)

map.get(2)
val maybeString2 = map.get(3)

List("a").map(x => s"Hello $x")
Nil.map(x => s"Hello $x")

maybeString.map(x => s"Hello $x")
maybeString2.map(x => s"Hello $x")

maybeString match {
  case Some(value) => s"Hello $value"
  case None        => None
}
