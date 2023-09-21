package example

class Demo {
  sealed trait List[+T] {
    def length: Int = this match {
      //    case Nil => 0
      case Cons(head, tail) => 1 + tail.length
    }
  }
  case object Nil                            extends List[Nothing]
  case class Cons[T](head: T, tail: List[T]) extends List[T]
}
