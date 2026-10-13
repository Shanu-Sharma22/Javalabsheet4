// Multilevel chain: Person -> Employee -> Manager
public class Manager extends Employee {
    private String department;

    Manager(String name, int age, int empId, double salary, String department) {
        super(name, age, empId, salary);
        this.department = department;
    }

    @Override
    void display() {
        super.display();   // goes up the chain: Employee -> Person
        System.out.println("Department: " + department);
    }
}
