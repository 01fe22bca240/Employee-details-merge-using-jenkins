import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Person {
    private String name;
    private Date dob;

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Assuming date format is DD-MM-YYYY
        this.dob = sdf.parse(dob);
    }

    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    public void displayAge() {
        Date currentDate = new Date();
        long diffInMillies = Math.abs(currentDate.getTime() - dob.getTime());
        long ageInMillis = diffInMillies;
        long age = ageInMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Age: " + age + " years");
    }

    public static void main(String[] args) throws ParseException {
        ExtendedPerson employee = new ExtendedPerson("John Doe", "01-01-1990", 1001, 60000);
        employee.displayEmployeeDetails();
    }
}
