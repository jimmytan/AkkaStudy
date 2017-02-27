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
  def name = "boxoffice"

  case class CreateEvent(name: String, tickets: Int)
  case class GetEvent(name: String)
  case object GetEvents
  case class GetTickets(event: String, tickets: Int)
  case class CancelEvent(name: String)
  case class Event(name: String, tickets: Int)
  case class Events(events: Vector[Event])
  

  
}
class BoxOffice(implicit timeout:Timeout) extends Actor{
  override def receive: Receive = ???
}
