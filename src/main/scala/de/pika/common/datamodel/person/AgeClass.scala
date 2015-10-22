package de.pika.common.datamodel.person

import de.pika.common.datamodel.person.Gender.Gender

/**
 * Created by pika on 22.10.15.
 */
sealed case class AgeClass(val description: String, val shortDesc: String, val range: Range, val gender: Gender) {
  def contains(age: Int): Boolean = {
    range.contains(age)
  }
}

object AgeClass {
  def fromAge(classes: Seq[AgeClass], age: Int): Option[AgeClass] = {
    classes.find(_.contains(age))
  }
}
