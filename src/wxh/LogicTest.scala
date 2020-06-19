package wxh

/**
  * ClassName: LogicTest
  * Description:逻辑运算符
  * Author wxh
  * Date: 2020/6/19 15:04
  * Version V1.0.0
  * Since 2.11.7
  */
object LogicTest {
  def main(args: Array[String]): Unit = {
    val a = true
    val b = false
    println("a && b = " + (a && b))
    println("a || b = " + (a || b))
    println("!(a && b) = " + !(a && b))
  }
}
