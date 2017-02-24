package  scala

/**
  * Created by Zhao.Qian on 2017/2/24.
  */
abstract class AbsIterator {
  type T
  def hasNext:Boolean
  def next:T
}