package com.ym.flink.examples.data.consumermanager

import com.ym.flink.examples.data.schudler.{EventLoop, FlinkDataGeneratorActor}
import grizzled.slf4j.Logger

/**
  * Created by hzyuemeng1 on 2016/9/1.
  */
class ConsumerManager(eventloop: EventLoop) extends FlinkDataGeneratorActor{
  override val log: Logger = _

  /** Handle incoming messages
    *
    * @return
    */
  override def handleMessage: Receive = ???
}
