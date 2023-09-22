

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.collection.mutable

Future(100)
  .map(_ + 2)
  .flatMap(x => Future(x))



val list = List(1, 2, 3)
//map2(list, x => x * x)

implicit class RichList(val xs: List[Int]) extends AnyVal {
  def map2(f: Int => Int): List[Int] = {
    val it = xs.iterator
    val buf: mutable.Buffer[Int] = mutable.Buffer()

    while (it.hasNext) {
      val x = it.next()
      val newX = f(x)
      buf.append(newX)
    }

    buf.toList
  }

}

list.map2(x => x * x)