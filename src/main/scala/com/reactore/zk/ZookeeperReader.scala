package com.reactore.zk

import com.typesafe.config.ConfigFactory
import ZookeeperPathConstants._

/**
  * Created by Aamir on 28/3/18.
  */
object ZookeeperReaderUtility {

  val configLoader = ConfigFactory.load()
  val environment = configLoader.getString("zookeeper.environment")
  val prefix = s"config.$environment."

  def getRecipientEmailId() = {
    ZookeeperHelper.getString(prefix + RECIPIENT_EMAIL_PATH)
  }

}


object ZookeeperPathConstants {
  final val RECIPIENT_EMAIL_PATH = "emailTo"
}

