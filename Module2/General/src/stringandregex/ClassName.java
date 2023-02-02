package stringandregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String NAME_CHECK = "^[CAP][0-9]{4}[GHIJKLM]$";
    public ClassName(){}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_CHECK);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
