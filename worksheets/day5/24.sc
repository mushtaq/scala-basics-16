import tc.implementation.Sorter
import tc.lib.Ord
import tc.app.Book
import data.Data

val list = List(11, 2, 30, 4, 1, 5, 9, 3)
val list2 = List("abc", "zsd", "rde")
val list3 = List(Some(11), Some(2), None, Some(8))
val list4 = List(Some("zxs"), None, Some("abc"))

Sorter.sort(list)(Ord.intOrd)
Sorter.sort(list2)(Ord.strOrd)
Sorter.sort(Data.books)(Book.bookOrd).foreach(println)
Sorter.sort(list3)(Ord.intOptOrd)
Sorter.sort(list4)(Ord.strOptOrd)
