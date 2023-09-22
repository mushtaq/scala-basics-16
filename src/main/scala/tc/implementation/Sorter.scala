package tc.implementation

import tc.lib.Ord

object Sorter {
  private def insert[T](x: T, sortedList: List[T])(implicit ord: Ord[T]): List[T] = {
    sortedList match {
      case Nil                               => List(x)
      case head :: _ if ord.compare(x, head) => x :: sortedList
      case head :: tail                      => head :: insert(x, tail)
    }
  }

  def sort[T](xs: List[T])(implicit ord: Ord[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail))
  }
}
