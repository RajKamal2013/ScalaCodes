package com.packt.courseware.l1a

import scala.io.StdIn

object Main {

  def printHello(): Unit = {
    println("Hello")
  }

  def main(args: Array[String]): Unit = {
    printHello();
    println("Lets start chat bot");
    val name = StdIn.readLine("Hi! What is your name ?")
    println(s"$name, tell me soemething interesting, say 'bye' to end the talk")
    var timeToBye = false
    while (!timeToBye) {
      timeToBye = StdIn.readLine(">") match {
        case "bye" => println("ok, bye")
          true
        case "time" =>
          println(s"time is ${java.time.LocalTime.now()}")
          false
        case _ =>
          println("Interesting ...")
          false
      }
    }
  }
}
