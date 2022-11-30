package bai2;

public class PartTimeEmployee extends Employee{
    private double workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(double workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(String id, String name, int age, String phone, String email, double workingHours) {
        super(id, name, age, phone, email);
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return super.toString()+
                "workingHours: " + workingHours;
    }
}
