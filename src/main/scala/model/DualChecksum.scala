package model

class DualChecksum extends Cheksumable {

  val M = 1000 //This number helps to keep the result between 0 and 999

  /**
   * This function iterates through each character in the word, converts its ASCII value to binary,
   * calculates a block using modulo M, and updates SumA and SumB accordingly.
   * The final result is SumA + SumB in a String.
   * @param word It contains the word that is going to be calculated
   * @return It returns the DualCheckSum already calculated
   */
  override def calculateChecksum(word: String): Int = {
    var sumA = 0
    var sumB = 0

    for (char <- word) {
      val binaryRepresentation = char.toInt.toBinaryString
      val block = binaryRepresentation.toInt % M

      // Calcular SumAnew
      val sumAnew = (sumA + block) % M

      // Calcular SumBnew
      sumB = (sumB + sumAnew) % M

      // Actualizar SumA
      sumA = sumAnew
    }
    // Concatenar SumAnew con SumBnew para obtener el resultado final
    val result = (sumA.toString + sumB.toString).toInt
    result

  }
}

