package wxh

/**
  * ClassName: IteratorTest
  * Description: 迭代器：遍历集合
  * Author wxh
  * Date: 2020/6/28 14:07
  * Version V1.0.0
  * Since 2.11.7
  */
object IteratorTest {
  def main(args: Array[String]): Unit = {
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")
    while (it.hasNext){
      println(it.next())
    }
  }
}
