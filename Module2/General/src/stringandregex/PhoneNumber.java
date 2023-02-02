package stringandregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_CHECK = "^\\([0-9]{2}\\)-\\((0[0-9]{9})\\)$";
    public  boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_CHECK);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
