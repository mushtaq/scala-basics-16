
// enum List[T]:
//   case Nil
//   case Cons[T]

sealed trait List[+T] {
  def length: Int = this match {
//    case Nil => 0
    case Cons(head, tail) => 1 + tail.length
  }
}
case object Nil extends List[Nothing]
case class Cons[T](head: T, tail: List[T]) extends List[T]


val list = Cons(1, Cons(2, Cons(3, Nil)))

list.length

def reverse[T](list: List[T]): List[T] = {
  def loop(rem: List[T], acc: List[T]): List[T] = rem match {
    case Nil              => acc
    case Cons(head, tail) => loop(tail, Cons(head, acc))
  }

  loop(list, Nil)
}

reverse(list)