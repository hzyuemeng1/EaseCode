/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ym.flink.examples.data.schudler

import java.util.concurrent.ConcurrentHashMap

import _root_.akka.actor.Actor
import com.ym.flink.examples.data.utils.Logging


/** Base trait for Flink's actors.
  *
  * The message handling logic is defined in the handleMessage method. This allows to mixin
  * stackable traits which change the message receiving behaviour.
  */
trait FlinkDataGeneratorActor extends Actor with Logging{
  val containerMap: java.util.Map[String, FlinkDataGeneratorActor] = new ConcurrentHashMap[String, FlinkDataGeneratorActor]
  override def receive: Receive = handleMessage

  /** Handle incoming messages
    *
    * @return
    */
  def handleMessage: Receive

  /** Factory method for messages. This method can be used by mixins to decorate messages
    *
    * @param message The message to decorate
    * @return The decorated message
    */
  def decorateMessage(message: Any): Any = {
    message
  }
}
