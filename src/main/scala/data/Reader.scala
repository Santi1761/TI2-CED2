package data

import scala.io.Source

/**
 * Is responsible for reading data from a text fileLee los datos
 */
class Reader {

  private var data: List[String] = _

  /**
   * Reads all lines from the file and converts them to a list
   * @param fileName
   */
  def loadFromTxt(fileName: String): Unit = {
    // Intenta abrir el archivo y leer las líneas
    try {
      val source = Source.fromFile(fileName)
      data = source.getLines().toList
      source.close()
    } catch {
      case e: Exception =>
        // Maneja las excepciones que puedan ocurrir al leer el archivo
        println(s"Error al leer el archivo: ${e.getMessage}")
        List.empty[String]
    }
  }

  /**
   * Get
   * @return
   */
  def getData(): List[String] = {
    data
  }
}