package wxh

/**
  * ClassName: RelationTest
  * Description:关系运算符
  * Author wxh
  * Date: 2020/6/19 15:04
  * Version V1.0.0
  * Since 2.11.7
  */
object RelationTest {
  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 20
    println("a == b = " + (a == b))
    println("a != b = " + (a != b))
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("b >= a = " + (b >= a))
    println("b <= a = " + (b <= a))
  }
}
