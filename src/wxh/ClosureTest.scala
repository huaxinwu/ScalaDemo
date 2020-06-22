package wxh

/**
  * ClassName: ClosureTest
  * Description: Scala闭包
  * Author wxh
  * Date: 2020/6/22 15:15
  * Version V1.0.0
  * Since 2.11.7
  */
object ClosureTest {
  def main(args: Array[String]): Unit = {
    println( "muliplier(1) value = " +  multiplier(1))
    println( "muliplier(2) value = " +  multiplier(2))
  }
  var factor = 3
  // 闭包声明
  val multiplier = (i:Int) => i*factor
}
