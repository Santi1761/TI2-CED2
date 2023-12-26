package model

/**
 * Trait or interface for classes that implement the ability to calculate checksums.
 */
trait Cheksumable {

  /**
   * Returns a value of type Int that represents the calculated checksum
   * @param word
   * @return
   */
  def calculateChecksum(word: String): Int

}
