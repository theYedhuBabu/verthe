
import java.time.DayOfWeek;
import java.time.LocalDate;

public class AssignmentDay2_1 {

    public static void main(String[] arg) {
        LocalDate dateNow = LocalDate.now(); // get todays date

        DayOfWeek dayNow = dateNow.getDayOfWeek(); // get today's day

        System.out.println("Today is : " + dayNow + " " + dateNow);

        LocalDate dateOneYearBefore = dateNow.minusYears(1); // get the date one year before today

        DayOfWeek dayOneYearBefore = dateOneYearBefore.getDayOfWeek(); // get the day one year before today

        System.out.println("Today One year before is : " + dayOneYearBefore + " " + dateOneYearBefore);

        LocalDate dateOneYearAfter = dateNow.plusYears(1); // get the date one year after today

        DayOfWeek dayOneYearAfter = dateOneYearAfter.getDayOfWeek(); // get the day one year after today

        System.out.println("Today One year before is : " + dayOneYearAfter + " " + dateOneYearAfter);
    }

}
