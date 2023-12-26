package model

import data.Writter

/**
 * Perform experiments on checksum calculations
 */
class Controller {


  private var result: String = _
  private val experiment = new Experiment()

  /**
   * Run the ex
   * @param word
   * @return resultSingle, resultDual
   */
  def runExperiment(word: List[String]):(List[String], List[String]) = {
    val resultSingle = experiment.calculateSingleChecksum(word)
    val resultDual = experiment.calculateDualChecksum(word)
    (resultSingle, resultDual)
  }

  /**
   * Takes the results of single and double checksum calculations, along with the execution time
   * @param resultSingle
   * @param resultDual
   * @param timeExecueted
   * @param writer
   */
  def sendResultToWriter(resultSingle: List[String], resultDual: List[String],timeExecueted: Long, writer: Writter): Unit = {
    writer.writeResults(resultSingle, "src/outputs/outputSingle.txt")
    writer.writeResults(resultDual, "src/outputs/outputDual.txt")
    writer.writeTimeExecuted(timeExecueted, "src/outputs/outputTime.txt")
  }


  /**
   * Get
   * @return
   */
  def getResult(): String = {

    result
  }

  /**
   * Set
   * @param result
   */
  def setResult(result: String): Unit = {

    this.result = result
  }
}
