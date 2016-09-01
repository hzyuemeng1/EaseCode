package com.ym.examples.scala.api

import com.ym.examples.java.api.Person

/**
  * Created by hzyuemeng1 on 2016/8/22.
  */
object TestPerson {


  type Set = Int => Boolean

  def main(args: Array[String]) {
    val p:Person = new Person("tom",3)
    println(p)

  }
  def contain(s:Set,elem: Int) =s(elem)

}
