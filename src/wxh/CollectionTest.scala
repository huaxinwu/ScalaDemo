package wxh

/**
  * ClassName: CollectionTest
  * Description: 集合
  * Author wxh
  * Date: 2020/6/24 16:52
  * Version V1.0.0
  * Since 2.11.7
  */
object CollectionTest {
  def main(args: Array[String]): Unit = {
    // 定义整型 List
    val x1 = List(1,2,3,4)
    val site = "Runoob"::("Google" :: ("Baidu" :: Nil))
    val nums = Nil

    println( "第一网站是 : " + site.head )
    println( "最后一个网站是 : " + site.tail )
    println( "查看列表 site 是否为空 : " + site.isEmpty )
    println( "查看 nums 是否为空 : " + nums.isEmpty )

    // 定义 Set
    val x2 = Set(1,3,5,7)
    val site2 = Set("Runoob", "Google", "Baidu")
    val nums2: Set[Int] = Set()

    println( "第一网站是 : " + site2.head )
    println( "最后一个网站是 : " + site2.tail )
    println( "查看列表 site 是否为空 : " + site2.isEmpty )
    println( "查看 nums2 是否为空 : " + nums2.isEmpty )

    // 定义 Map
    val x3 = Map("one" -> 1, "two" -> 2, "three" -> 3)
    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    val nums3: Map[Int, Int] = Map()

    println( "colors 中的键为 : " + colors.keys )
    println( "colors 中的值为 : " + colors.values )
    println( "检测 colors 是否为空 : " + colors.isEmpty )
    println( "检测 nums3 是否为空 : " + nums3.isEmpty )

    // 创建两个不同类型元素的元组
    val x4 = (10, "Runoob")
    val t = (4,3,2,1)
    val sum = t._1 + t._2 + t._3 + t._4
    println( "元素之和为: "  + sum )

    // 定义 Option
    val x5:Option[Int] = Some(5)
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    // Some("value1")
    println(value1)
    // None
    println(value2)
  }
}
