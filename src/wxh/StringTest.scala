package wxh

/**
  * ClassName: StringTest
  * Description: Scala字符串
  * Author wxh
  * Date: 2020/6/22 15:24
  * Version V1.0.0
  * Since 2.11.7
  */
object StringTest {
  var greeting:String = "Hello Scala"
  def main(args: Array[String]): Unit = {
    println(greeting)
    println(greeting.length)
    println(greeting.charAt(3))
    println(greeting.concat(" language"))
  }

}
