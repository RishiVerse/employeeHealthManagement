import java.util.ArrayList;
import java.util.List;

public class getEmployee {

    public List<Employee> getEmployeeByDesignation(String designation) {
        List<Employee> employee = EmployeeData.getEmployeeData();

        // list is interface and Arraylist is its implementation
        List<Employee> addEmp = new ArrayList<>();

        for (Employee e : employee) {
            if (e.getEmployeeDesignation().equals(designation)) {
                addEmp.add(e);
            }
        }
        return addEmp;
    }
}
