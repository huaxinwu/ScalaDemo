package wxh

/**
  * ClassName: FeatureTest
  * Description:trait--特征，类似Java抽象类
  * Author wxh
  * Date: 2020/6/29 14:28
  * Version V1.0.0
  * Since 2.11.7
  */
trait FeatureTest {
  // 只定义未实现
  def isEqual(x: Any): Boolean
  // 定义并实现
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

// 类继承
class Point2(xc: Int, yc: Int) extends FeatureTest {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x

}

object Test2 {
  def main(args: Array[String]) {
    val p1 = new Point2(2, 3)
    val p2 = new Point2(2, 4)
    val p3 = new Point2(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}