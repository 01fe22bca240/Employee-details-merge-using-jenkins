import java.text.ParseException;

public class ExtendedPerson extends Person {
    private int empId;
    private double salary;

    public ExtendedPerson(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: $" + salary);
        displayPersonName(); // Calling displayPersonName() method from the Person class
        displayAge(); // Calling displayAge() method from the Person class
    }

    
}
