class Employee {
    private int id;
    private double salary;
    private String designation;

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setSalary(45000);
        e.setDesignation("Software Developer");

        System.out.println("Employee ID: " + e.getId());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Designation: " + e.getDesignation());
    }

}