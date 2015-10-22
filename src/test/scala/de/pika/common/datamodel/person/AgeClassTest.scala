package de.pika.common.datamodel.person

import org.specs2.mutable.Specification

/**
 * Created by pika on 23.10.15.
 */
object AgeClassTest extends Specification {
  "AgeClass a" should {
    val a = AgeClass("Schueler M10", "M10", 10 to 10, Gender.MALE)
    "be returned when searched for age 10" in {
      val ageClass = Seq(
        AgeClass("Schueler M9", "M9", 9 to 9, Gender.MALE),
        AgeClass("Schueler M10", "M10", 10 to 10, Gender.MALE),
        AgeClass("Schueler M11", "M11", 11 to 11, Gender.MALE))
      AgeClass.fromAge(ageClass, 10) mustEqual Some(a)
    }
  }
}
