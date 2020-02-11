def apply(dd: Int, mm: Int, yyyy: Int, HH: Int, MM: Int, SSS: Int): String = {
  dd + "-" + mm + "-" + yyyy + " " + HH + ":" + MM + ":" + "SSS"
}

def unapply(dateTime: String): Option[String] = {
  val day = dateTime split "-"
  if (day.length == 3) Some(day(0)) else None
}
unapply("08-09-1999 14:23:60")

