package wxh

/**
  * ClassName: LoopTest
  * Description: 循环语句
  * Author wxh
  * Date: 2020/6/22 14:52
  * Version V1.0.0
  * Since 2.11.7
  */
object LoopTest {
  def main(args: Array[String]): Unit = {
    var a = 10
    while(a < 20){
      println( "Value of a: " + a)
      a = a + 1
    }

    do{
      println("Value of a: " + a)
      a = a + 1
    }while ( a < 20)

    for(a <- 1 to 10){
      println("Value of a: " + a)
    }
  }
}
