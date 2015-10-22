package de.pika.common.datamodel.person

/**
 * Created by pika on 22.10.15.
 */
case class Person(firstName: String, lastName: String)
case class CompPerson(override val firstName: String, override val lastName: String) extends Person(firstName, lastName)
