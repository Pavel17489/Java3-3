public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int credit = 1000000;

        int monthlyPayment1 = service.calculate(credit, 1);
        System.out.println(monthlyPayment1);

        int monthlyPayment2 = service.calculate(credit, 2);
        System.out.println(monthlyPayment2);

        int monthlyPayment3 = service.calculate(credit, 3);
        System.out.println(monthlyPayment3);

    }
}