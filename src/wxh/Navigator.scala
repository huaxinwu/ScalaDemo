package wxh

/**
  * ClassName: Navigator
  * Description:作用域保护
  * Author wxh
  * Date: 2020/6/19 15:04
  * Version V1.0.0
  * Since 2.11.7
  */
package bobsrockets {
  package navigation {
    private[bobsrockets] class Navigator {
      protected[navigation] def useStarChart(): Unit = {

      }
      class LegOfJourney {
        private[Navigator] val distance = 100
      }
      private[this] var speed = 200
    }
  }
  package launch {
    import navigation._
    object Vehicle {
      private[launch] val guide = new Navigator
    }
  }
}