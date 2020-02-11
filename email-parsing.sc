def email(mail: String): AnyVal = {
  val EMAIL = """(^[A-Za-z0-9][A-Za-z0-9\.]*)@((?:[A-Za-z0-9]+\.)+[A-Za-z]{2,63}$)""".r
  mail match {
    case EMAIL(user, domain) =>
      print(s"user :: $user ")
      print(s" domain :: $domain")
    case _ => print("invalid")

  }

}


email("manaskashyaptech@gmail.com")