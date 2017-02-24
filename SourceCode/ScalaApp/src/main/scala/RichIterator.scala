package  scala

/**
  * Created by Zhao.Qian on 2017/2/24.
  */
trait RichIterator extends AbsIterator{
  def foreach(f:T=>Unit){while (hasNext) f(next)}
}