
val xs: List[Int] = List(1, 2, 3, 4, 5)

xs.map(x => x * x)
xs.map(x => s"Hello $x")

/////////

val f: Int => Int =
  x => x * x

xs.map(f)


/////////

//val g = x => s"Hello $x"
val g2 = (x: Int) => s"Hello $x"
val g3: Int => String = x => s"Hello $x"

////////





val square: Int => Int =
  x => x * x

square(9)
