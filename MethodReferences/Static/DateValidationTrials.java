
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateValidationTrials{

    public static void main(String []args){
        Date d1 = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyy HH:mm");
        try{
            String startDate="09/20/2018";
            String startTime="11:43";
            d1 = simpleDateFormat.parse(startDate+" "+startTime);
        }
        catch(ParseException p) {
            System.out.println("Shitt");
        }

        Date d2 = new Date();
        System.out.println(d1);
        System.out.println(d2);

        if(d1 != null) {
            if(!d1.after(d2)){
                System.out.println("Not greater");
            }
        }
    }
}