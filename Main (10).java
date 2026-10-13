public class Main {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("Ravi");
        Pharmacy p2 = new Pharmacy("Neha");

        System.out.println("--- Before changing static value ---");
        p1.display();
        p2.display();

        // Change the static value once, through the class name
        Pharmacy.pharmacyName = "Himalaya Pharmacy";
        Pharmacy.location = "Rishikesh";

        System.out.println("\n--- After changing static value ---");
        p1.display();   // both objects see the new value,
        p2.display();   // proving the static data is shared
    }
}
