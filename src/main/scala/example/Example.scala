package example

sealed trait Say[+A] {
  def say: A
}

final case class Hi(str: String) extends AnyVal

object Example {
  def sayHi: Say[Hi] = new Say[Hi] {
    override def say = Hi("hi")
  }
}
