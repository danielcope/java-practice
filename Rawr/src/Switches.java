import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Switches {
 
    public static void main(String[] args) {
      
      // switch = statement that allows a variable to be tested for equality against a list of values

      Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
      
      Date date = calendar.getTime();
      int day = calendar.get(Calendar.DAY_OF_WEEK);

      switch(day) {

          case 1: System.out.println("It is Sunday");
          break;

          case 2: System.out.println("It is Monday");
          break;
          
          case 3: System.out.println("It is Tuesday");
          break;
          
          case 4: System.out.println("It is Wednesday");
          break;
          
          case 5: System.out.println("It is Thursday");
          break;
          
          case 6: System.out.println("It is Friday");
          break;

          case 7: System.out.println("It is Saturday");
          break;

          default: System.out.println("That is not a day");

      }

    }

}
