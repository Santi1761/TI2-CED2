package data

import java.io.{FileWriter, PrintWriter}

/**
 * Provides functionality to write results and execution times to files
 */
class Writter {

  /**
   * Allows writing to the end of the file without overwriting existing content
   * @param results
   * @param fileName
   */
  def writeResults(results: List[String], fileName: String): Unit = {
    val writer = new PrintWriter(new FileWriter(fileName, true)) //Esto es para que se abra el archivo, siga escribiendo y no sobreescriba (append = true)
    try {
      writer.write(s"-------\n")
      results.foreach { result =>
        writer.write(result)
        writer.write("\n")
      }
    } catch {
      case e: Exception =>
        println(s"Error $e")
    } finally {
      writer.close()
    }
  }

  /**
   * Allows writing to the end of the file without overwriting existing content
   * @param timeExecuted
   * @param fileName
   */
  def writeTimeExecuted(timeExecuted: Long, fileName: String): Unit = {
    val writer = new PrintWriter(new FileWriter(fileName, true))
    try {
      writer.write(s"-------\n")
      writer.write(timeExecuted.toString)
      writer.write("\n")
    } catch {
      case e: Exception =>
        println(s"Error $e")
    } finally {
      writer.close()
    }
  }

  
}
