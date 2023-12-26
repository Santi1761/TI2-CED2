package data

import org.scalatest.funsuite.AnyFunSuite

  val reader = new Reader
class ReaderTest extends AnyFunSuite {

  test("getData should return the first line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "dsasadnaskndasjfnjaksfbnjasbfjakfsnkfsnamkfnaskjfnasjkfnasjfnalsjnfasjlnfslajnfasljfnajlfnaljfnasjf"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(0) == expectedData)
  }

  test("getData should return the second line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "foiasinjoasnfjasnfjkasjofnqoighuojcvnmnvcbnxvjkbsjidhgbnsjngosihgnuosdjngbjsidbghsidbgyewbywbybhfba"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(1) == expectedData)
  }

  test("getData should return the third line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "bvlcxpvbkcpoxjsopdihfuiodsbfhivbuhwvfutcfvxgfyvzsaduoashfuihgasfiyugayifgbayisfgyasifbhiafbhiafbhia"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(2) == expectedData)
  }
  test("getData should return the fourth line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "dsipajdfsihjufhsuighdsphjpiojbniohnjvbhbasdhqufhrueihfgyudisbfijhdsngpsngvnjixnknvjkdsbgidhsihgbdfi"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(3) == expectedData)
  }
  test("getData should return the fiveth line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "ohasufhsafnsajpaoskposajpicmpkzbnxjcbvuoubbdioshnduvijsbnhgjivbnfgherbybwqtrvqbuotrboudhuoinoifhdnu"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(4) == expectedData)
  }

  test("getData should return the sixth line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "pojosffpaijfoabfjiabnjvbnvsdapdjqpjweioqhroihewibihjvbcxhkjbbkdnmncnxbcxpjdsiofhqopjpwoqjroihbtojbf"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(5) == expectedData)
  }

  test("getData should return the seventh line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "sfpiafhaiojqewiofhweuoghdusnlkdsmlfmpovocjxuiobnjdsbhjkfasvbhgvcbhigbizgbihabvshvdjgvqugvaguhvbqiqo"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(6) == expectedData)
  }

  test("getData should return the eighth line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "jcnbxkjzbkcjbnaijbsnoiunqiojqpoijfiohnjsndjksnbksdbpfndksbfksbkfjbdskjfbsjkdbfhsdbfhsvgjfvwgjevgfwv"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(7) == expectedData)
  }

  test("getData should return the ninth line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "dsiajodihsjqoijdsakiofjaspiofjpaoijgoihjfdsonvjxcnbjkvcxbvkjxbvuisdhbuihsuidgbhiusbubwehbewibewifxz"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(8) == expectedData)
  }

  test("getData should return the tenth line") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "ihjiosahouiashduiqhwuighquighquiegquigebiqurgyutgycxzbvjzxbnvlndshokjhojgfpjhfoibnjonzjvhauihuhsiau"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(9) == expectedData)
  }

  test("getData should be different the line 1 from 2") {
    val fileName = "src/test/scala/data/resources/data1.txt"
    val expectedData = "foiasinjoasnfjasnfjkasjofnqoighuojcvnmnvcbnxvjkbsjidhgbnsjngosihgnuosdjngbjsidbghsidbgyewbywbybhfba"
    reader.loadFromTxt(fileName)
    val realData = reader.getData()
    assert(realData(0) != expectedData)
  }

}