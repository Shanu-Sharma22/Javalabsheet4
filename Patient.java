public class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // if-else inside a Patient method classifies the patient
    String classify() {
        if (age < 0) {
            return "Invalid age";
        } else if (age < 18) {
            return "Child - Pediatric Ward";
        } else if (age < 60) {
            return "Adult - General Ward";
        } else {
            return "Senior Citizen - Priority Care";
        }
    }

    void displayCategory() {
        System.out.println(name + " (age " + age + ") -> " + classify());
    }
}
