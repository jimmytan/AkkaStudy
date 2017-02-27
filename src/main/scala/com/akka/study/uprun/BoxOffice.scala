package com.akka.study.uprun

import akka.actor.{Actor, Props}
import akka.actor.Actor.Receive
import akka.util.Timeout

/**
  * Created by wenjuntan on 2017-02-26.
  *
  *
  *
  */

object BoxOffice{
  def props(implicit timeout: Timeout) = Props(new BoxOffice)

  
}
class BoxOffice(implicit timeout:Timeout) extends Actor{
  override def receive: Receive = ???
}
