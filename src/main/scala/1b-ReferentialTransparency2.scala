import org.joda.time.DateTime

object ScheduleBuilder2 {

  def buildProgrammeSchedule(programmes:
                             List[Programme]):
  List[Programme] = {
    programmes
      .sortBy(_.airDate)
  }

}

case class Programme(name: String, airDate: DateTime)