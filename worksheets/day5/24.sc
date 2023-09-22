import tc.implementation.Sorter
import tc.lib.Ord
import data.Data

val list = List(11, 2, 30, 4, 1, 5, 9, 3)
val list2 = List("abc", "zsd", "rde")
val list3 = List(Some(11), Some(2), None, Some(8))
val list4 = List(Some("zxs"), None, Some("abc"))
val list5 = List((10, "xyz"), (10, "abc"), (5, "zzz"))

Sorter.sort(list)

{
  implicit val intOrdDec: Ord[Int] = Ord.intOrdDec

  Sorter.sort(list)
}


Sorter.sort(list2)
Sorter.sort(Data.books).foreach(println)
Sorter.sort(list3)
Sorter.sort(list4)



Sorter.sort(list5)

{
  implicit val intOrdDec: Ord[Int] = Ord.intOrdDec

  Sorter.sort(list5)
}

