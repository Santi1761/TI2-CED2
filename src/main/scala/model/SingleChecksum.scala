package model

class SingleChecksum extends Cheksumable {

  val M = 1000 //This number helps to keep the result between 0 and 999

  /**
   * This function iterates through each character in the word, converts its ASCII value to binary,
   * performs a left shift operation on the binary representation, and updates the checksum accordingly.
   * The final checksum derived by adding together the shifted binary values and applying the modulo M.
   * @param word It contains the word that is going to be calculated
   * @return It returns the SingleChecksum already calculated.
   */
  override def calculateChecksum(word: String): Int = {
      var checksum = 0
      for (char <- word) {
        val binaryRepresentation = char.toInt.toBinaryString//esto lo convierte del Ascii al binario
        val shiftedBinary = binaryRepresentation.toInt << 1//Corre a la izquierda
        checksum = (checksum + shiftedBinary) % M
      }
      checksum
  }

}
