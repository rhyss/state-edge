import org.joda.time.DateTime

class ScheduleBuilder1(programmeLookupService: ProgrammeLookupService) {

  def buildProgrammeSchedule(): Seq[Programme] = {
    programmeLookupService.getProgrammes.sortBy(_.airDate)
  }

}

object ScheduleBuilder2 {

  def buildProgrammeSchedule(programmes: Seq[Programme]): Seq[Programme] = {
    programmes.sortBy(_.airDate)
  }

}

class ProgrammeLookupService {
  def getProgrammes: List[Programme] = ???
}

case class Programme(name: String, airDate: DateTime)