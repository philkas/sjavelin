package de.pika.common.datamodel.person

/**
 * Created by pika on 22.10.15.
 */
object Gender {
  sealed abstract class Gender

  case object MALE extends Gender
  case object FEMALE extends Gender

  val values = Seq(MALE, FEMALE)
}
