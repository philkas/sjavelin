package de.pika.database

import slick.lifted.Tag
import slick.driver.SQLiteDriver.api._

/**
 * Created by pika on 23.10.15.
 */
class Addresses(tag: Tag) extends Table[(Int, String, String, String, String, String)](tag, "ADDRESSES") {
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def street = column[String]("STREET")
  def houseNo = column[String]("HOUSENO")
  def zip = column[String]("ZIP")
  def city = column[String]("CITY")
  def country = column[String]("COUNTRY")

  def * = (id, street, houseNo, zip, city, country)
}
