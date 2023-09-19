import data.AliceData._

val stopWords = stopWordText.split(stopWordRegex).toSet

bookText
  .split(bookRegex)
  .filter(word => !stopWords.contains(word))
  .groupBy(word => word)
//  .view
  .mapValues(words => words.length)
//  .toMap
  .toList
//  .sortBy(pair => pair._2)
//  .sortBy { pair =>
//    val (_, value) = pair
//    value
//  }
  .sortBy {
    case (_, value) => value
  }
  .reverse
  .take(10)
  .foreach(println)

// val map: Map[A, B] = ???
// val list: List[(A, B)] = map.toList
