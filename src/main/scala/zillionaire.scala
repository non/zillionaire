package zillionaire

import java.util.Scanner
import scala.annotation.tailrec
import scala.util.{Success, Failure, Try}
import zillion.cardinal

object Main {

  val stdin = new Scanner(System.in)

  def parse(s: String): Try[BigInt] =
    Try(BigDecimal(s).toBigInt)

  def say(msg: String): Unit = {
    println(s"  saying '$msg'")
    new ProcessBuilder("say", msg).start().waitFor()
  }

  @tailrec final def repl(): Unit = {
    System.out.print("please give me a number: ")
    System.out.flush()
    if (stdin.hasNext()) {
      parse(stdin.nextLine()) match {
        case Success(n) => say(cardinal(n))
        case Failure(_) => say("not a number")
      }
      repl()
    } else {
      println("done")
      ()
    }
  }

  def main(args: Array[String]): Unit = repl()
}
