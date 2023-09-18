
val square: Int => Int = x => x * x

val square2: Function1[Int, Int] = x => x * x

square2(9)
square2.apply(9)

trait Fun1[I1, O] {
  def apply(arg: I1): O
}

//

def sqr(x: Int) = x * x

val f3: Int => Int = sqr

val f4: Int => Int = new Function1[Int, Int] {
  override def apply(v1: Int): Int = sqr(v1)
}

val f5: Int => Int = (v1: Int) => sqr(v1)

val f6: Int => Int = v1 => sqr(v1)
val f7: Int => Int = sqr
