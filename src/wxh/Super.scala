package wxh

/**
  * ClassName: Super
  * Description: 受保护的方法
  * Author wxh
  * Date: 2020/6/19 14:53
  * Version V1.0.0
  * Since 2.11.7
  */
package p{
  class Super {
    protected def f(): Unit = {

    }
  }

  class Sub extends Super {
    // 同一个包中，子类可以调用父类的方法
    f()
  }

  class Other {
    // 同一个包中，不是子类不能访问父类的方法
    //    (new Super).f()
  }
}

