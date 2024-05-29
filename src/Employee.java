import java.time.Year;

public class Employee extends Person {
    protected int hireDate;
    protected String companyName;
    protected double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return Year.now().getValue() - hireDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Company: " + companyName + ", Job Seniority: " + getJobSeniority() + " years, Salary: " + getSalary();
    }
}
