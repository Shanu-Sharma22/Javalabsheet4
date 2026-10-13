public class Main {
    public static void main(String[] args) {
        MedicineProduct m = new MedicineProduct("Dolo 650", 30.0, "12/2028");
        m.display();
        // m.price = 5;   // ERROR: price has private access in MedicineProduct
    }
}
