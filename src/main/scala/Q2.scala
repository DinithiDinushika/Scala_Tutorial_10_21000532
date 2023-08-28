object Q2 {

  def countLetterOccurrences(strList : List[String]): Int ={
    val lenList = strList.map(word => word.length())
    val totalCount = lenList.reduce((x, y) => x + y)
    totalCount
  }

  def main(args: Array[String]): Unit = {

    val inputList = List("apple", "banana", "cherry", "date")
    val result = countLetterOccurrences(inputList)
    println("Total count of letter occurrences: "+ result)

  }

}
