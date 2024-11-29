import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    // Collection used in this class is list  { collections -1 }

    public static List<Employee> getEmployeeData() {
        return Arrays.asList(
                new Employee("Alice", 101, "Software Engineer", "IT", 75000.00, 28, 1001, "Comprehensive", "Gold"),
                new Employee("Bob", 102, "Software Engineer", "Analytics", 68000.00, 30, 1002, "Basic", "Silver"),
                new Employee("Charlie", 103, "Project Manager", "Management", 120000.00, 40, 1003, "Comprehensive", "Platinum"),
                new Employee("Diana", 104, "HR Specialist", "Human Resources", 55000.00, 27, 1004, "Basic", "Bronze"),
                new Employee("Eve", 105, "UI/UX Designer", "Design", 60000.00, 25, 1005, "Comprehensive", "Gold")
        );
    }
}
