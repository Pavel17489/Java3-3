public class CreditPaymentService {
    public int calculate(int credit, int creditPeriod) {

        double annualRate = 9.99;
        double monthlyRate = annualRate / 12 / 100;
        int n = creditPeriod * 12;

        double i = (monthlyRate + 1);

        int monthlyPayment;
        monthlyPayment = (int) (credit * ((monthlyRate * (Math.pow(i, n))) / ((Math.pow(i, n)) - 1)));

        return monthlyPayment;

    }


}
