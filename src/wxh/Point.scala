package wxh

/**
  * ClassName: Point
  * Description: 类定义
  * Author wxh
  * Date: 2020/6/28 14:16
  * Version V1.0.0
  * Since 2.11.7
  */
class Point(xc:Int, yc:Int) {
  var x:Int = xc
  var y:Int = yc
  // 定义方法
  def move(dx:Int, dy:Int): Unit ={
    x = x + dx
    y = y + dy
    println("x的坐标点："+x)
    println("y的坐标点："+y)
  }
}

/* 没有public修饰类，可以定义多个类 ，单利对象  */
object Test{
  def main(args: Array[String]): Unit = {
    // 原始坐标点位置
    val p = new Point(10,20)
    // 移到一个新的位置
    p.move(10, 10);
  }
}

class Location(  val xc: Int,  val yc: Int,val zc :Int) extends Point(xc, yc){
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("x 的坐标点 : " + x);
    println ("y 的坐标点 : " + y);
    println ("z 的坐标点 : " + z);
  }
}