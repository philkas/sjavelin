package de.pika.common.datamodel.person

/**
 * Created by pika on 22.10.15.
 */
object Gender {
  sealed abstract class Gender

  sealed case object MALE extends Gender
  sealed case object FEMALE extends Gender

  val values = Seq(MALE, FEMALE)
}
