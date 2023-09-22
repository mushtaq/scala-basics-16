def insert(x: Int, sortedList: List[Int]): List[Int] = {
  sortedList match {
    case Nil => List(x)
    case head :: _ if x < head =>  x :: sortedList
    case head :: tail => head :: insert(x, tail)
  }
}

def sort(xs: List[Int]): List[Int] = xs match {
  case Nil          => Nil
  case head :: tail => insert(head, sort(tail))
}

val list = List(1, 2, 3, 4)

insert(1, list)

val list = List(11, 2, 30, 4, 1, 5, 9, 3)

sort(list)

def dd(a: Int)(b: String) = a + b.length

dd(10): String => Int