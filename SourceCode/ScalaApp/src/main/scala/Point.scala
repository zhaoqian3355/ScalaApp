package scala

/**
  * Created by Zhao.Qian on 2017/2/22.
  */
class Point(var x: Int, var y: Int) extends Similarity {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    "(" + x + "," + y + ")"
  }

  override def isSimilar(obj: Any): Boolean = {
    obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x
  }
}