package de.pika.common.datamodel.person

/**
 * Created by pika on 22.10.15.
 */
abstract class Person(firstName: String, lastName: String)
case class CompPerson(val firstName: String, val lastName: String) extends Person(firstName, lastName)
