
// enum Day:
//   case Weekend, Weekday
//

sealed trait Day
object Day {
  case object Weekday extends Day
  case object Weekend extends Day
}

sealed trait Customer
object Customer {
  case object Rewards extends Customer
  case object Regular extends Customer
}

case class Category(customer: Customer, day: Day)

case class BookingRequest(customer: Customer, days: List[Day]) {
  val categories: List[Category] = days.map(day => Category(customer, day))
}

case class Hotel(name: String, rating: Int, rateCard: Map[Category, Int]) {
  //asdasdasddasdX
  val x = //some computation
  def getCost(bookingRequest: BookingRequest): Int =
    bookingRequest.categories.map(cat => rateCard(cat)).sum
  //asdasdasddasdX
  def m() = ???
  //asdasdasddasdX
}

class HotelService(hotels: List[Hotel]) {
  def findBestHotel(bookingRequest: BookingRequest): String =
    hotels.minBy(h => (h.getCost(bookingRequest), -h.rating)).name
}

object Data {
  val hotels = List(
    Hotel("Lakewood", 3, Map(
      Category(Customer.Regular, Day.Weekday) -> 110,
      Category(Customer.Rewards, Day.Weekday) -> 80,
      Category(Customer.Regular, Day.Weekend) -> 90,
      Category(Customer.Rewards, Day.Weekend) -> 80
    )),
    Hotel("Bridgewood", 4, Map(
      Category(Customer.Regular, Day.Weekday) -> 160,
      Category(Customer.Rewards, Day.Weekday) -> 110,
      Category(Customer.Regular, Day.Weekend) -> 60,
      Category(Customer.Rewards, Day.Weekend) -> 50
    )),
    Hotel("Ridgewood", 5, Map(
      Category(Customer.Regular, Day.Weekday) -> 220,
      Category(Customer.Rewards, Day.Weekday) -> 100,
      Category(Customer.Regular, Day.Weekend) -> 150,
      Category(Customer.Rewards, Day.Weekend) -> 40
    )),
  )
}

val hotelService = new HotelService(Data.hotels)
hotelService.findBestHotel(
  BookingRequest.apply(Customer.Regular, List(Day.Weekday, Day.Weekday, Day.Weekday))
)

val bookingRequest =
  BookingRequest(Customer.Regular, List(Day.Weekday, Day.Weekend, Day.Weekend))

hotelService.findBestHotel(
  bookingRequest
)

hotelService.findBestHotel(
  BookingRequest(Customer.Rewards, List(Day.Weekday, Day.Weekday, Day.Weekend))
)

Data.hotels.foreach(println)
