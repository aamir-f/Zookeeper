package com.reactore.zk

import com.typesafe.config.ConfigFactory

/**
  * Created by Aamir on 28/3/18.
  */
trait ZookeeperConverters {

  implicit class ZookeeperDataConverter(val nodeValue: Array[Byte]) {
    def asString: String = new String(nodeValue)

    def asInt: Int = new String(nodeValue).toInt
  }

}
