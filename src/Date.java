import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Date {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat SDF = new SimpleDateFormat(
                "yyyy-MM-dd"
        );

        java.util.Date d1 = SDF.parse("2024-03-18");
        java.util.Date d2 = SDF.parse("2024-04-18");

        long DIF = d2.getTime() - d1.getTime();
        System.out.println(TimeUnit.MILLISECONDS.toDays(DIF));
    }

    public Date() throws ParseException {
    }
}
