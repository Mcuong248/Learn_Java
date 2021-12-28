import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean emailValidator(String email){
        String EMAIL_REGIX = "^[\\\\w!#$%&’*+/=?{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(EMAIL_REGIX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean phoneValidator(String mobile){
        String PHONE_REGIX = "^\\+[0-9]{2,3}+-[0-9]{9}$";
        Pattern pattern = Pattern.compile(PHONE_REGIX);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.matches();
    }
}