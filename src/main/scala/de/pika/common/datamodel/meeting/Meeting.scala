package de.pika.common.datamodel.meeting

import java.time.LocalDate
import de.pika.common.datamodel.address.Address
import de.pika.common.datamodel.person.Person

/**
 * Created by pika on 22.10.15.
 */
class Meeting(
  val name: String,
  val startDate: LocalDate,
  val endDate: LocalDate,
  val location: Address,
  val promoter: Person,
  val promoterAddress: Address
) {
}
