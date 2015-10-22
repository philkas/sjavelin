package de.pika.common.datamodel.meeting

import de.pika.common.datamodel.measure.Meter

/**
 * Created by pika on 22.10.15.
 */
sealed abstract class Discipline {
  def name: String
}

sealed abstract class RunDiscipline extends Discipline {
  def distance: Meter
}

sealed case class SprintDiscipline(val name: String, val distance: Meter) extends RunDiscipline
sealed case class LongrunDiscipline(val name: String, val distance: Meter) extends RunDiscipline

sealed abstract class TechnicalDiscipline extends Discipline

sealed case class ThrowingDiscipline (val name: String) extends Discipline
sealed case class VerticalJumpDiscipline(val name: String) extends Discipline
sealed case class HorizontalJumpDiscipline(val name: String) extends Discipline

object Discipline {
  lazy val _50m = SprintDiscipline("50m", Meter(50.0))
  lazy val _100m = SprintDiscipline("100m", Meter(100.0))
  lazy val _200m = SprintDiscipline("200m", Meter(200.0))
}
