package com.ym.examples.scala.api

/**
  * Created by hzyuemeng1 on 2016/8/29.
  */
class Dog(val name: String,val age: Int)
object Dog{
  def apply(name:String,age:Int) ={
    new Dog(name,age)
  }

  def unapply(d:Any):Option[(String,Int)] ={
    d match {
      case d:Dog => Some(d.name,d.age)
      case _ => None
    }
  }
  def OldDog(d:Dog):Boolean = d match
    {
    case Dog(name,age) if(age > 18) => true
    case _ => false
  }
}
