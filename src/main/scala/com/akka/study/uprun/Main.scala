package com.akka.study.uprun

import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory

/**
  * Created by wenjuntan on 2017-02-26.
  */
object Main extends App{
  var config  = ConfigFactory.load()
  var host = config.getString("http.host")
  var port = config.getString("http.port")
  implicit val system = ActorSystem()
  implicit val sc = system.dispatcher
  
  

}
