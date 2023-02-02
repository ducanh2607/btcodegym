package stringandregex;

public class ClassNameTest {
    public static final String[] classNameTest = new String[]{"C1234H", "M0318G", "P0323A", "C0318G", "Cc1234G", "C1234HH"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String name : classNameTest){
            boolean isValid = className.validate(name);
            System.out.println("Class name is " + name + " is valid: " + isValid);
        }
    }
}
