package ui

import data.{Reader, Writter}
import model.{Controller, Experiment}

object Main extends App {

  start()

  def start(): Unit = {

    val reader = new Reader()
    val writer = new Writter()
    val controller = new Controller()

    for (i <- 1 to 5) {
      val fileName = s"src/test/scala/data/resources/data$i.txt"
      val startTime = System.currentTimeMillis()//Beginning counting time
      reader.loadFromTxt(fileName)
      val inputData = reader.getData()
      val (resultSingle, resultDual) = controller.runExperiment(inputData)
      val endTime = System.currentTimeMillis()// Finish counting the time
      val timeExecuted = endTime - startTime
      println(s"Iteration:$i")
      println("Results of SingleCheckSum: ")
      println(resultSingle)
      println("Results of DualCheckSum: ")
      println(resultDual)
      println(s"Time: ")
      println(timeExecuted)

      controller.sendResultToWriter(resultSingle, resultDual,timeExecuted ,writer)
    }
  }
}
