package model

import org.scalatest.funsuite.AnyFunSuite

class SingleChecksumTest extends AnyFunSuite {

  val singleChecksum = new SingleChecksum()

  //-------------------- Unitary test --------------------------//

  test("calculateChecksum should return the correct checksum for a single character") {
    assert(singleChecksum.calculateChecksum("A") == 2)
    assert(singleChecksum.calculateChecksum("Z") == 20)
  }

  test("calculateChecksum should return the correct checksum for a word") {
    assert(singleChecksum.calculateChecksum("Hello") == 824)
    assert(singleChecksum.calculateChecksum("Scala") == 248)
  }

  test("calculateChecksum should return the correct checksum for lowercase letters") {
    assert(singleChecksum.calculateChecksum("abcd") == 244)
  }

  test("calculateChecksum should return the correct checksum for a mix of uppercase and lowercase letters") {
    assert(singleChecksum.calculateChecksum("AbCdEfG") == 888)
  }

  test("calculateChecksum should handle spaces in the word") {
    assert(singleChecksum.calculateChecksum("Hello World") == 688)
  }

  test("calculateChecksum should handle a long word") {
    assert(singleChecksum.calculateChecksum("ThisIsALongWordWithNumbers123") == 134)
  }

  test("calculateChecksum should return 0 for an empty string") {
    assert(singleChecksum.calculateChecksum("") == 0)
  }

  test("calculateChecksum should handle special characters") {
    assert(singleChecksum.calculateChecksum("!@#$%^") == 646)
  }

  //-----------------More Tests ------------------//

  test("calculate the abc... in single checkSum") {
    assert(singleChecksum.calculateChecksum("a") == 2)
    assert(singleChecksum.calculateChecksum("b") == 20)
    assert(singleChecksum.calculateChecksum("c") == 22)
    assert(singleChecksum.calculateChecksum("d") == 200)
    assert(singleChecksum.calculateChecksum("e") == 202)
    assert(singleChecksum.calculateChecksum("f") == 220)
    assert(singleChecksum.calculateChecksum("g") == 222)
    assert(singleChecksum.calculateChecksum("h") == 0)
    assert(singleChecksum.calculateChecksum("i") == 2)
    assert(singleChecksum.calculateChecksum("j") == 20)
    assert(singleChecksum.calculateChecksum("k") == 22)
    assert(singleChecksum.calculateChecksum("l") == 200)
    assert(singleChecksum.calculateChecksum("m") == 202)
    assert(singleChecksum.calculateChecksum("n") == 220)
    assert(singleChecksum.calculateChecksum("ñ") == 2)
    assert(singleChecksum.calculateChecksum("o") == 222)
    assert(singleChecksum.calculateChecksum("p") == 0)
    assert(singleChecksum.calculateChecksum("q") == 2)
    assert(singleChecksum.calculateChecksum("r") == 20)
    assert(singleChecksum.calculateChecksum("s") == 22)
    assert(singleChecksum.calculateChecksum("t") == 200)
    assert(singleChecksum.calculateChecksum("u") == 202)
    assert(singleChecksum.calculateChecksum("v") == 220)
    assert(singleChecksum.calculateChecksum("w") == 222)
    assert(singleChecksum.calculateChecksum("x") == 0)
    assert(singleChecksum.calculateChecksum("y") == 2)
    assert(singleChecksum.calculateChecksum("z") == 20)
  }

  test("calculate How much is a special characters") {
    assert(singleChecksum.calculateChecksum(" ") == 0)
    assert(singleChecksum.calculateChecksum("-") == 202)
    assert(singleChecksum.calculateChecksum("_") == 222)
    assert(singleChecksum.calculateChecksum("+") == 22)
    assert(singleChecksum.calculateChecksum("]") == 202)
    assert(singleChecksum.calculateChecksum("[") == 22)
    assert(singleChecksum.calculateChecksum("}") == 202)
    assert(singleChecksum.calculateChecksum("{") == 22)
    assert(singleChecksum.calculateChecksum("*") == 20)
    assert(singleChecksum.calculateChecksum("|") == 200)
    assert(singleChecksum.calculateChecksum("°") == 0)
    assert(singleChecksum.calculateChecksum("¬") == 200)
    assert(singleChecksum.calculateChecksum("`") == 0)
    assert(singleChecksum.calculateChecksum("¨") == 0)
    assert(singleChecksum.calculateChecksum(".") == 220)
    assert(singleChecksum.calculateChecksum(",") == 200)
    assert(singleChecksum.calculateChecksum(";") == 22)
    assert(singleChecksum.calculateChecksum(":") == 20)
  }

  test("calculate How much is our names") {
    assert(singleChecksum.calculateChecksum("Daron") == 664)
    assert(singleChecksum.calculateChecksum("Camilo") == 650)
    assert(singleChecksum.calculateChecksum("Santiago") == 892)
    assert(singleChecksum.calculateChecksum("Mercado") == 870)
    assert(singleChecksum.calculateChecksum("Bueno") == 866)
    assert(singleChecksum.calculateChecksum("Arboleda") == 868)
  }

  test("calculate How much is accent") {
    assert(singleChecksum.calculateChecksum("pelón") == 644)
    assert(singleChecksum.calculateChecksum("parís") == 246)
    assert(singleChecksum.calculateChecksum("camión") == 470)
    assert(singleChecksum.calculateChecksum("francés") == 508)
  }
}
