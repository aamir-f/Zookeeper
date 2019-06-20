package com.reactore.zk

/**
  * Created by Aamir on 28/3/18
  */
object ReaderApp extends App {

  val emailId = ZookeeperReaderUtility.getRecipientEmailId()
  println("Recipient Email Address : " + emailId)

}
