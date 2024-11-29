import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Prepare the data
        // build small classes based on type of operation
        // call them from main class for testing
        List<Employee> employeesList = EmployeeData.getEmployeeData();

        getEmployee emp = new getEmployee();

        List<Employee> e = emp.getEmployeeByDesignation("Software Engineer");

        for (Employee printEmp : e) {

            System.out.println(printEmp);
        }
    }
}