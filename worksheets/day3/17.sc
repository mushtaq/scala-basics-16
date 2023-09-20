
// enum List[T]:
//   case Nil
//   case Cons[T]

sealed trait List[+T]
case object Nil extends List[Nothing]
case class Cons[T](head: T, tail: List[T]) extends List[T]


val list = Cons(1, Cons(2, Cons(3, Nil)))


def length[T](list: List[T]): Int = list match {
  case Nil => 0
  case Cons(head, tail) => 1 + length(tail)
}


length(list)