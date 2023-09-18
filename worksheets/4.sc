
val x = 10

val y: Int
  = 10

////////////

// this is a function
val square: Int => Int = x => x * x
square(9)

// this is method
def sqr(x: Int) = x * x
sqr(9)

///////////
// every function is a value
// every value is an object

// this implies that
// every function is an object

//////////

val xs = List(1, 2, 3, 4)
xs.map(x => x * x)
xs.map(square)
xs.map(sqr)

val f = square

val f2 = sqr
val f3: Int => Int = sqr