import collection.mutable

val list = List(1, 2, 3)

val iterator = list.iterator

iterator.next()
iterator.next()

iterator.hasNext

iterator.next()
iterator.hasNext


val buf = mutable.Buffer(1, 2, 3)

buf.toList


def map(xs: List[Int], f: Int => Int): List[Int] = {
  val it = xs.iterator
  val buf: mutable.Buffer[Int] = mutable.Buffer()

  while (it.hasNext) {
    val x = it.next()
    val newX = f(x)
    buf.append(newX)
  }

  buf.toList
}

map(list, x => x * x)

//////////////////

val zs = 0 :: List(1, 2, 3)
zs.reverse