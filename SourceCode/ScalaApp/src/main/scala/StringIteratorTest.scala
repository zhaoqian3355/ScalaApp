package scala

/**
  * Created by Zhao.Qian on 2017/2/24.
  */
object StringIteratorTest {
  def main(args: Array[String]): Unit = {
    class Iter extends StringIterator("Hello World!") with RichIterator
    val iter=new Iter
    iter foreach println
  }
}
