
sealed trait JsValue
case object JsNull extends JsValue
case object JsTrue extends JsValue
case object JsFalse extends JsValue
case class JsNumber(x: Double) extends JsValue
case class JsString(x: String) extends JsValue
case class JsArray(xs: List[JsValue]) extends JsValue
case class JsObject(xs: Map[String, JsValue]) extends JsValue

val x: JsValue = ???

