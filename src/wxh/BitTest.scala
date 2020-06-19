package wxh

/**
  * ClassName: BitTest
  * Description:位运算符
  * Author wxh
  * Date: 2020/6/19 15:04
  * Version V1.0.0
  * Since 2.11.7
  */
object BitTest {
  def main(args: Array[String]): Unit = {
    val a = 60
    /* 60 = 0011 1100 */
    val b = 13
    /* 13 = 0000 1101 */
    var c = 0
    /* 12 = 0000 1100 */
    c = a & b
    println("a & b = " + c)
    /* 61 = 0011 1101 */
    c = a | b
    println("a | b = " + c)
    /* 49 = 0011 0001 */
    c = a ^ b
    println("a ^ b = " + c)
    /* -61 = 1100 0011 */
    c = ~a
    println("~a = " + c)
    /* 240 = 1111 0000 */
    c = a << 2
    println("a << 2 = " + c)
    /* 15 = 1111 */
    c = a >> 2
    println("a >> 2  = " + c)
    /* 15 = 0000 1111 */
    c = a >>> 2
    println("a >>> 2 = " + c)
  }
}
