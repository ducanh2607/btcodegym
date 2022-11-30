package bai2;

public class FullTImeEmployee extends Employee {
    private double bonus;
    private double fine;
    private double fixedSalary;

    public FullTImeEmployee() {
    }

    public FullTImeEmployee(double bonus, double fine) {
        this.bonus = bonus;
        this.fine = fine;
    }

    public FullTImeEmployee(String id, String name, int age, String phone, String email, double bonus, double fine, double fixedSalary) {
        super(id, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.fixedSalary = fixedSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "bonus: " + bonus +
                ", fine: " + fine + ", fixed salary: " + fixedSalary;
    }


}
