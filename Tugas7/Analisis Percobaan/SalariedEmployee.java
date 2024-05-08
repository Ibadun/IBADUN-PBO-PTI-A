package laporan;

import java.time.LocalDate;
public class SalariedEmployee extends Employee {
    private double weeklySalary;
    public SalariedEmployee(String name, String noKTP, double salary) {
        super(name, noKTP);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public double earnings() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("Salaried employee: " +
                super.toString() + "\nWeekly salary: " + getWeeklySalary());
    }
}
   