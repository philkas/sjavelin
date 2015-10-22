package de.pika.common.datamodel.meeting

import de.pika.common.datamodel.measure.Meter

/**
 * Created by pika on 22.10.15.
 */

object Disciplines {

  sealed abstract class Discipline extends Ordered[Discipline] {
    def name: String
    def id: Int

    def compare(that: Discipline) = this.id - that.id
  }

  sealed abstract class RunDiscipline extends Discipline {
    def distance: Meter
  }
  sealed abstract class SprintDiscipline(val id: Int, val name: String, val distance: Meter) extends RunDiscipline
  sealed abstract class LongrunDiscipline(val id: Int, val name: String, val distance: Meter) extends RunDiscipline

  sealed abstract class TechnicalDiscipline extends Discipline
  sealed abstract class ThrowingDiscipline(val id: Int, val name: String) extends Discipline
  sealed abstract class VerticalJumpDiscipline(val id: Int, val name: String) extends Discipline
  sealed abstract class HorizontalJumpDiscipline(val id: Int, val name: String) extends Discipline

  case object D_LONGJUMP extends HorizontalJumpDiscipline(1, "Longjump")
  case object D_HIGHJUMP extends VerticalJumpDiscipline(2, "Highjump")
  case object D_DISCUS extends ThrowingDiscipline(3, "Discus")
  case object D_100M extends SprintDiscipline(4, "100m", Meter(100.0))
  case object D_1000M extends LongrunDiscipline(5, "1000m", Meter(1000.0))

  val disciplines = Seq(D_1000M, D_100M, D_LONGJUMP, D_DISCUS, D_HIGHJUMP)

  def runDisciplines() : Seq[Discipline] = {
    disciplines.filter(_.isInstanceOf[RunDiscipline])
  }

}
