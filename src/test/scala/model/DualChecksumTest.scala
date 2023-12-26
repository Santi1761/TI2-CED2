package model

import org.scalatest.funsuite.AnyFunSuite

class DualChecksumTest extends AnyFunSuite {

  test("calculateChecksum should return the correct checksum for a single character") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("A") == 11)
    assert(dualChecksum.calculateChecksum("Z") == 1010)
  }

  test("calculateChecksum should return the correct checksum for a word") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("Hello") == 41215)
    assert(dualChecksum.calculateChecksum("Scala") == 124303)
  }

  test("calculateChecksum should return the correct checksum for lowercase letters") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("abcd") == 122156)
  }

  test("calculateChecksum should return the correct checksum for a mix of uppercase and lowercase letters") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("AbCdEfG") == 444156)
  }

  test("calculateChecksum should handle spaces in the word") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("Hello World") == 844816)
  }

  test("calculateChecksum should handle a long word") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("ThisIsALongWordWithNumbers123") == 567298)
  }

  test("calculateChecksum should return 0 for an empty string") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("") == 0)
  }

  test("calculateChecksum should handle special characters") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("!@#$%^") == 323662)
  }

  test("calculate the abc") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("a") == 11)
    assert(dualChecksum.calculateChecksum("b") == 1010)
    assert(dualChecksum.calculateChecksum("c") == 1111)
    assert(dualChecksum.calculateChecksum("d") == 100100)
    assert(dualChecksum.calculateChecksum("e") == 101101)
    assert(dualChecksum.calculateChecksum("f") == 110110)
    assert(dualChecksum.calculateChecksum("g") == 111111)
    assert(dualChecksum.calculateChecksum("h") == 0)
    assert(dualChecksum.calculateChecksum("i") == 11)
    assert(dualChecksum.calculateChecksum("j") == 1010)
    assert(dualChecksum.calculateChecksum("k") == 1111)
    assert(dualChecksum.calculateChecksum("l") == 100100)
    assert(dualChecksum.calculateChecksum("m") == 101101)
    assert(dualChecksum.calculateChecksum("n") == 110110)
    assert(dualChecksum.calculateChecksum("ñ") == 11)
    assert(dualChecksum.calculateChecksum("o") == 111111)
    assert(dualChecksum.calculateChecksum("p") == 0)
    assert(dualChecksum.calculateChecksum("q") == 11)
    assert(dualChecksum.calculateChecksum("r") == 1010)
    assert(dualChecksum.calculateChecksum("s") == 1111)
    assert(dualChecksum.calculateChecksum("t") == 100100)
    assert(dualChecksum.calculateChecksum("u") == 101101)
    assert(dualChecksum.calculateChecksum("v") == 110110)
    assert(dualChecksum.calculateChecksum("w") == 111111)
    assert(dualChecksum.calculateChecksum("x") == 0)
    assert(dualChecksum.calculateChecksum("y") == 11)
    assert(dualChecksum.calculateChecksum("z") == 1010)
  }

  test("calculate How much is a special characters") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum(" ") == 0)
    assert(dualChecksum.calculateChecksum("-") == 101101)
    assert(dualChecksum.calculateChecksum("_") == 111111)
    assert(dualChecksum.calculateChecksum("+") == 1111)
  }

  test("calculate the Name of cities") {
    val dualChecksum = new DualChecksum
    assert(dualChecksum.calculateChecksum("Paris") == 2347)
    assert(dualChecksum.calculateChecksum("Cali") == 113248)
    assert(dualChecksum.calculateChecksum("Monaco") == 445737)
    assert(dualChecksum.calculateChecksum("Buenaventura") == 856889)
  }
}