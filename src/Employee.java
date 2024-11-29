public class Employee {

    private String employeeName;
    private int employeeId;
    private String employeeDesignation;
    private String employeeDepartment;
    private double employeeSalary;
    private int employeeAge;
    private int healthId;
    private String healthType;
    private String healthPlan;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeAge=" + employeeAge +
                ", healthId=" + healthId +
                ", healthType='" + healthType + '\'' +
                ", healthPlan='" + healthPlan + '\'' +
                '}';
    }

    public Employee(String employeeName, int employeeId, String employeeDesignation,
                    String employeeDepartment, double employeeSalary, int employeeAge,
                    int healthId, String healthType, String healthPlan) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDesignation = employeeDesignation;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.healthId = healthId;
        this.healthType = healthType;
        this.healthPlan = healthPlan;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public int getHealthId() {
        return healthId;
    }

    public void setHealthId(int healthId) {
        this.healthId = healthId;
    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }
}
