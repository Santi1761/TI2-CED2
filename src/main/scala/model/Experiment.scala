package model

class Experiment {

  val singleChecksum = SingleChecksum()
  val dualChecksum = DualChecksum()

  /**
   * This function iterates through the indices of the list, appends the index to according to the
   * word, and calculates the SingleChecksum.
   * @param word It represents the list of words for which the SingleChecksum is calculated.
   * @return It is number converted to strings and returned in a list.
   */
  def calculateSingleChecksum(word: List[String]): List[String] = {
    (0 to 9).toList.map {
      case i =>
        val listResult = singleChecksum.calculateChecksum(word(i) + i.toString)
        listResult.toString 
    }
  }

  /**
   * This function iterates through the indices of the list, appends the index to the corresponding
   * word, and calculates the DualChecksum
   * @param word It represents the list of words for which the DualChecksum is calculated.
   * @return It is number converted to strings and returned in a list.
   */
  def calculateDualChecksum(word: List[String]): List[String] = {
    (0 to 9).toList.map {
      case i =>
        val listResult = dualChecksum.calculateChecksum(word(i) + i.toString)
        listResult.toString
    }
  }
}
