public class Doctor extends Employee {
    Doctor(String name, int empId) {
        super(name, empId);
    }

    @Override
    void show() {
        System.out.println("[Doctor]");
        super.show();
    }
}
