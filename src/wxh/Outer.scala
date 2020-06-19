package wxh

/**
  * ClassName: Outer
  * Description: 私有方法
  * Author wxh
  * Date: 2020/6/19 14:41
  * Version V1.0.0
  * Since 2.11.7
  */
class Outer {
  class Inner{
    private def f(): Unit ={
      println("f")
    }
    class InnerMost{
      // 本类内部可以访问
      f()
    }
  }
  // 不允许外部访问，只允许在本类的内部访问--报错
//  (new Inner).f()
}
