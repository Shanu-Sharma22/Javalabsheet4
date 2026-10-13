public class Main {
    public static void main(String[] args) {
        // Hierarchical inheritance: two children (Doctor, Pharmacist), one parent (Employee)
        Doctor d = new Doctor("Dr. Meera Joshi", 101, 90000, "Cardiology");
        Pharmacist p = new Pharmacist("Ravi Kumar", 301, 35000, "UK-PH-4521");
        d.display();
        System.out.println();
        p.display();
    }
}
