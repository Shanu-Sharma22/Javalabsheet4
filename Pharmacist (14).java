// Single inheritance: Pharmacist extends exactly one parent (Employee)
public class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int empId, double salary, String licenseNo) {
        super(name, empId, salary);   // call parent constructor
        this.licenseNo = licenseNo;
    }

    @Override
    void display() {
        super.display();              // reuse parent's display
        System.out.println("License: " + licenseNo);
    }
}
