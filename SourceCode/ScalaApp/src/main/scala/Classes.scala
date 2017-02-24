package scala

/**
  * Created by Zhao.Qian on 2017/2/22.
  */
object Classes{
  def main(args: Array[String]){
    println("Hello World!")
    val pt = new Point(1, 2)
    println(pt)
    pt.move(10, 10)
    println(pt)
  }
}