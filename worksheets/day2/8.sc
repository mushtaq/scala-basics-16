import annotation.tailrec

def map(xs: List[Int], f: Int => Int): List[Int] = {
  var output = List.empty[Int]
  val itr = xs.iterator
  while(itr.hasNext) {
    val x = itr.next()
    val newX = f(x)
    output = newX :: output
  }
  output.reverse
}

val xs = List(1,2,3)

map(xs, x => x * x)

////////////

def map2(xs: List[Int], f: Int => Int): List[Int] = {

  @tailrec
  def loop(rem: List[Int], acc: List[Int]): List[Int] = {
    if(rem.isEmpty)
      acc
    else {
      val x = rem.head
      val newX = f(x)
      val newAcc = newX :: acc
      loop(rem.tail, newAcc)
    }
  }

  loop(xs, List.empty).reverse
}

map2(xs, x => x * x)