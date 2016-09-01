package com.ym.flink.examples.data.producermanager

import com.ym.flink.examples.data.schudler.{EventLoop, FlinkDataGeneratorActor}
import grizzled.slf4j.Logger

import scala.collection.mutable

/**
  * Created by hzyuemeng1 on 2016/9/1.
  */
class ProducerManager(val eventloop: EventLoop) extends FlinkDataGeneratorActor{

  override val log: Logger = _

  /** Handle incoming messages
    *
    * @return
    */
  override def handleMessage: Receive = ???

  @throws[T](classOf[Exception])
  override def preStart(): Unit = {
    try{

    }catch{
      case
    }
  }
}
