package AccessModifier;

public class Student1 {
    String name = "John";
    private String classes = "C02";
    public Student1(){}
    String setName(String name){
        this.name = name;
        return this.name;
    }
    String setClasses(String classes){
        this.classes = classes;
        return classes;
    }

}
