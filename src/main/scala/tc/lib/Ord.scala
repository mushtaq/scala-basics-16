package tc.lib

trait Ord[T] {
  def compare(a: T, b: T): Boolean
}

object Ord {
  implicit val intOrd: Ord[Int] = new Ord[Int] {
    override def compare(a: Int, b: Int): Boolean = a < b
  }

  val intOrdDec: Ord[Int] = new Ord[Int] {
    override def compare(a: Int, b: Int): Boolean = a > b
  }

  implicit val strOrd: Ord[String] = new Ord[String] {
    override def compare(a: String, b: String): Boolean = a < b
  }

  implicit def optOrd[T](implicit ord: Ord[T]): Ord[Option[T]] = new Ord[Option[T]] {
    override def compare(a: Option[T], b: Option[T]): Boolean = (a, b) match {
      case (Some(x), Some(y)) => ord.compare(x, y)
      case (None, _)          => true
      case (_, None)          => false
    }
  }

  implicit def t2Ord[T1, T2](implicit ord1: Ord[T1], ord2: Ord[T2]): Ord[(T1, T2)] = new Ord[(T1, T2)] {
    override def compare(a: (T1, T2), b: (T1, T2)): Boolean =
      if (a._1 == b._1)
        ord2.compare(a._2, b._2)
      else
        ord1.compare(a._1, b._1)
  }
}
