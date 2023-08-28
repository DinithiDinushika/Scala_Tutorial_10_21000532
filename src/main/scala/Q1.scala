object Q1 {

  def calculateAverage(tempList: List[Int]): Double ={
    val newList = tempList.map(c => (c * 9/5) + 32)
    val res = newList.reduce( (x, y) => x + y)
    val len = newList.size
    val average = res/len.toDouble
    average
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(0, 10, 20, 30)
    val result= calculateAverage(inputList)
    println("Average Fahrenheit temperature: "+ result)

  }

}
