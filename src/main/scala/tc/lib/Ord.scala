package tc.lib

trait Ord[T] {
  def compare(a: T, b: T): Boolean
}

object Ord {
  val intOrd: Ord[Int] = new Ord[Int] {
    override def compare(a: Int, b: Int): Boolean = a < b
  }

  val strOrd: Ord[String] = new Ord[String] {
    override def compare(a: String, b: String): Boolean = a < b
  }

  val intOptOrd: Ord[Option[Int]] = new Ord[Option[Int]] {
    override def compare(a: Option[Int], b: Option[Int]): Boolean = (a, b) match {
      case (Some(x), Some(y)) => x < y
      case (None, _)          => true
      case (_, None)          => false
    }
  }

  val strOptOrd: Ord[Option[String]] = new Ord[Option[String]] {
    override def compare(a: Option[String], b: Option[String]): Boolean = (a, b) match {
      case (Some(x), Some(y)) => x < y
      case (None, _)          => true
      case (_, None)          => false
    }
  }
}
