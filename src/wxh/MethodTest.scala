package wxh

/**
  * ClassName: MethodTest
  * Description: 方法定义与调用
  * Author wxh
  * Date: 2020/6/22 15:07
  * Version V1.0.0
  * Since 2.11.7
  */
object MethodTest {
  def main(args: Array[String]): Unit = {
    println("Returned Value : " + addInt(5,7))
  }

  /* 两个数相加的方法定义  */
  def addInt(a:Int, b:Int): Int ={
    var sum:Int = 0
    sum = a + b
    return sum
  }
}
