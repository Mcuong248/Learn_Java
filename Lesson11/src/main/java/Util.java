import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Util {
    public static String formatDate(LocalDate date){
        String pattern = "dd/MM/yyyy";
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(myFormatter);
    }
}
