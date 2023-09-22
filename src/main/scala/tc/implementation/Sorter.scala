package tc.implementation

import tc.lib.Ord

object Sorter {
  private def insert[T](x: T, sortedList: List[T])(ord: Ord[T]): List[T] = {
    sortedList match {
      case Nil                          => List(x)
      case head :: _ if ord.compare(x, head) => x :: sortedList
      case head :: tail                 => head :: insert(x, tail)(ord)
    }
  }

  def sort[T](xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail)(ord))(ord)
  }
}
