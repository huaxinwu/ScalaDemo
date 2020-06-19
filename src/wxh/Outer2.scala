package wxh

/**
  * ClassName: Outer2
  * Description:公共方法
  * Author wxh
  * Date: 2020/6/19 15:04
  * Version V1.0.0
  * Since 2.11.7
  */
class Outer2 {
  class Inner{
    def f(): Unit ={
      println("f")
    }
    class InnerMost{
      // 没有指定方法的修饰符，默认为public，任何地方都可以访问
      f()
    }
  }
  // 没有指定方法的修饰符，默认为public，任何地方都可以访问
  (new Inner).f()
}
