import scala.collection.mutable

val xs = List(1, 2, 3, 4, 5)

xs = List(1, 2, 3)
xs.appendedAll(List(6))
xs

val ys = mutable.Buffer(1, 2, 3, 4, 5)

ys = mutable.Buffer(1, 2, 3)
ys.append(6)
ys