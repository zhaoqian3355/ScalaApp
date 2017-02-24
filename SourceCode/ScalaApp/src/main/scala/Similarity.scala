package scala

/**
  * Created by Zhao.Qian on 2017/2/22.
  */
trait Similarity {
  def isSimilar(x: Any): Boolean

  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}