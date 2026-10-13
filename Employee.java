public class Employee extends Person {
    private int empId;
    private double salary;

    Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Emp ID : " + empId);
        System.out.println("Salary : Rs. " + salary);
    }
}
