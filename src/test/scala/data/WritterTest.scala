package data

import org.scalatest.funsuite.AnyFunSuite

class WritterTest extends AnyFunSuite {
  val writter = new Writter
  val fileName = "src/test/scala/data/resources/output_for_Tests.txt"
  val results = List("2333", "39990", "324242", "3342", "232423")

  test("// Verify that the file is created and contains the expected results") {
    writter.writeResults(results, fileName)
    val source = scala.io.Source.fromFile(fileName)
    val fileContents = try source.mkString finally source.close()
    // Split the single line by commas
    val resultList = fileContents.split(",").map(_.trim).toList
    assert(resultList(0) == results(0))
  }

  test("Should equals") {
    writter.writeResults(results, fileName)

    // Verify that the file is created and contains the expected results
    val source = scala.io.Source.fromFile(fileName)
    val fileContents = try source.mkString finally source.close()
    // Split the single line by commas
    val resultList = fileContents.split(",").map(_.trim).toList
    assert(resultList(2) == results(2))
  }

  test("Should be different") {
    writter.writeResults(results, fileName)

    // Verify that the file is created and contains the expected results
    val source = scala.io.Source.fromFile(fileName)
    val fileContents = try source.mkString finally source.close()
    // Split the single line by commas
    val resultList = fileContents.split(",").map(_.trim).toList
    assert(resultList(1) != results(2))
  }

  test("This should be different as well") {
    writter.writeResults(results, fileName)

    // Verify that the file is created and contains the expected results
    val source = scala.io.Source.fromFile(fileName)
    val fileContents = try source.mkString finally source.close()
    // Split the single line by commas
    val resultList = fileContents.split(",").map(_.trim).toList
    assert(resultList(3) != results(4))
  }
  
  
}