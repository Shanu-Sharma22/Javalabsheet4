public class Main {
    public static void main(String[] args) {
        System.out.println("=== Why Java cannot extend two classes ===");
        System.out.println("If a class could extend two parents that both have a method with the");
        System.out.println("same signature, e.g. show(), the compiler could not decide which one to");
        System.out.println("inherit. This is the AMBIGUITY (Diamond) problem.");
        System.out.println("Java avoids it by allowing only ONE parent class.\n");

        Professor p = new Professor();
        p.doBoth();
    }
}
