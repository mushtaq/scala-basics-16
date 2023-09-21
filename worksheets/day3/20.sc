import play.api.libs.json._


def transform(json: JsValue): JsValue = json match {
  case JsNull => ???
  case _: JsBoolean => ???
  case JsNumber(value) => ???
  case JsString(value) => ???
  case JsArray(value) => ???
  case JsObject(underlying) => ???
}
