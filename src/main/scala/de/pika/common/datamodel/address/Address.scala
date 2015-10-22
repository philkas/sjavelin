package de.pika.common.datamodel.address

/**
 * Created by pika on 22.10.15.
 */
sealed case class Address(street: String, houseNo: String, zipCode: String, city: String, country: String) {
}
