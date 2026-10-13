public class Main {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill("Arjun Singh");
        bill.setConsultationFee(500);
        bill.setMedicineFee(750.50);
        bill.setLabFee(1200);
        bill.displayBill();
    }
}
