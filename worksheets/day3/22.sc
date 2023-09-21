val list = List(1, 2, 3, 4)

list match {
  case a :: b :: c :: d :: Nil => c
  case _                       => 0
}

list match {
  case a :: rest => a
  case _         => 0
}

list match {
  case List(a, b, c, d) => d
  case _                => 0
}

list match {
  case List(a, rest) => a
  case _             => 0
}

list match {
  case List(a, _*) => a
  case _           => 0
}

list match {
  case List(a, rest @ _*) => rest.sum
  case _                  => 0
}

def sum(xs: List[Int]) = xs.sum
sum(List(1, 2, 3, 4))

def sum(xs: Int*) = xs.sum
sum(1, 2, 3, 4)
