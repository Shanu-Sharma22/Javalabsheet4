public class Main {
    public static void main(String[] args) {
        System.out.println("Hybrid inheritance = a MIX of two or more inheritance types.");
        System.out.println("Below: Multilevel (Person -> Employee) + Hierarchical (Employee -> Doctor, Nurse)");
        System.out.println("Using only single-parent links, so it is legal in Java.\n");

        Doctor d = new Doctor("Dr. Meera", 101);
        Nurse n = new Nurse("Pooja", 202);
        d.show();
        System.out.println();
        n.show();
    }
}
