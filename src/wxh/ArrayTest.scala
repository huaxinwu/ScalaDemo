package wxh

/**
  * ClassName: ArrayTest
  * Description: 数组
  * Author wxh
  * Date: 2020/6/23 11:10
  * Version V1.0.0
  * Since 2.11.7
  */
object ArrayTest {
  def main(args: Array[String]): Unit = {
    var myArray = Array(1.9, 2.9, 3.4, 3.5)
    // 输出数组的所有元素
    for(x <- myArray){
      println(x)
    }
    // 数组所有元素之和
    var total = 0.0;
    for ( i <- 0 to (myArray.length - 1)) {
      total += myArray(i);
    }
    println("数组总和："+total)

    var myMatrix = Array.ofDim[Int](3,3)
    // 创建矩阵
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        myMatrix(i)(j) = j
      }
      // 打印二维数组
      for(i <- 0 to 2){
        for(j <- 0 to 2){
          println(" "+myMatrix(i)(j))
        }
        // 换行
        println()
      }
    }
  }
}
