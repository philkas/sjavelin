package de.pika.database

import slick.lifted.Tag
import slick.driver.SQLiteDriver.api._

/**
 * Created by pika on 23.10.15.
 */
class Meetings(tag: Tag) extends Table[(Int, String)](tag, "MEETINGS") {
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def name = column[String]("NAME")

  def * = (id, name)
}
