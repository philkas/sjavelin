package de.pika.common.datamodel.person

import java.time.LocalDate

import de.pika.common.datamodel.person.Gender.Gender

/**
 * Created by pika on 22.10.15.
 */
class Person(val firstName: String, val lastName: String)

abstract class Competitor {
  def name: String
  def gender: Gender
  def birthyear: Int
  def age: Int = {
    LocalDate.now().getYear - birthyear
  }
}

class PersonCompetitor(val person: Person, val gender: Gender, val birthyear: Int) extends Competitor {
  def name: String = {
    person.firstName concat  person.lastName
  }
}