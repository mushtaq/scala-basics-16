import play.api.libs.json._
import data.Data

object :: {
  def unapply(str: String): Option[(String, String)] =
    str.split(":") match {
      case Array(pre, post) => Some((pre, post))
      case _                => None
    }
}

def transform(json: JsValue): JsValue = json match {
  case JsNull       => JsString("I am null")
  case x: JsBoolean => JsBoolean(!x.value)
  case JsNumber(x)  => JsNumber(x * x)
//  case JsString(x)  => JsString("Hello " + x.stripPrefix("urn:"))
//  case JsString(pre :: post) => JsString(s"Hello $post")
//  case JsString(pre :: post) => if(pre == "urn") JsString(s"Hello $post") else json
//  case JsString(pre :: post) if pre == "urn" => JsString(s"Hello $post")
  case JsString("urn" :: "ignore") => json
  case JsString("urn" :: post)     => JsString(s"Hello $post")
  case JsString(x)                 => JsString(x)
  case JsArray(xs)                 => JsArray(xs.map(transform))
  case JsObject(xs) =>
    val result = xs.map {
      case pair @ ("a" | "b", v) => pair
      case (k, v)                => (k, transform(v))
    }
    JsObject(result)
}

Json.prettyPrint(transform(Data.json))
