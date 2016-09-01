package com.ym.flink.examples.data.schudler

import grizzled.slf4j.Logger



/**
  * Created by hzyuemeng1 on 2016/9/1.
  */

private[scheduler] sealed trait DataTaskManagerSchedulerEvent
private[scheduler] case class DataTaskManagerStarted(hostName: String, Id: Int) extends DataTaskManagerSchedulerEvent
private[scheduler] case class DataTaskManagerCompleted(TaskManagerID: String, completedTime: Long) extends DataTaskManagerSchedulerEvent
private[scheduler] case class ErrorReported(msg: String, e: Throwable) extends DataTaskManagerSchedulerEvent


class DataGeneratorSchduler extends FlinkDataGeneratorActor{


  var eventloop = _


  override def receive: Receive = handleMessage
  override def handleMessage: Receive = {
    case DataTaskManagerStarted(hostname,id) =>
         logInfo(s"Start DataTaskManager($hostname,$id)")


  }

  def start = {
    eventloop = new EventLoop[DataTaskManagerSchedulerEvent]("producer-eventloop") {



      /**
        * Invoked in the event thread when polling events from the event queue.
        *
        * Note: Should avoid calling blocking actions in `onReceive`, or the event thread will be blocked
        * and cannot process events in time. If you want to call some blocking actions, run them in
        * another thread.
        */
      override protected def onReceive(event: DataTaskManagerSchedulerEvent): Unit = process(event)

      /**
        * Invoked if `onReceive` throws any non fatal error. Any non fatal error thrown from `onError`
        * will be ignored.
        */
      override protected def onError(e: Throwable): Unit = ???
    }
  }

def process(event:DataTaskManagerSchedulerEvent): Unit = {



}







}
