package com.github.kkotowiczz.chapter10.loggers

trait CryptoLogger extends Logger {
  val key: Int = 3
  def encrypt(message: String): String = {
    val encryptedMessage = for {
      character <- message
      encryptedCharVal = character + key
    } yield encryptedCharVal.toChar
    encryptedMessage.mkString("")
  }

  def decrypt(encryptedMessage: String): String = {
    val decryptedMessage = for {
      character <- encryptedMessage
      decryptedCharVal = character - key
    } yield decryptedCharVal.toChar
    decryptedMessage.mkString("")
  }

  abstract override def log(msg: String): Unit = {
    println(encrypt("message"))
  }
}
