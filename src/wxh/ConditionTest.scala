package wxh

/**
  * ClassName: ConditionTest
  * Description:条件语句
  * Author wxh
  * Date: 2020/6/19 15:04
  * Version V1.0.0
  * Since 2.11.7
  */
object ConditionTest {
  def main(args: Array[String]): Unit = {
    val x = 30
    if (x == 10){
      println("X 的值为 10")
    } else if(x == 20){
      println("X 的值为 20")
    } else if (x == 30){
      println("X 的值为 30")
    } else{
      println("无法判断 X 的值")
    }
  }
}
