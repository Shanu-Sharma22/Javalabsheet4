public class Employee extends Person {
    int empId;

    Employee(String name, int empId) {
        super(name);
        this.empId = empId;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Emp ID: " + empId);
    }
}
