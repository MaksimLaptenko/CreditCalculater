public class CreditPaymentService {
    public int calculate(int summa, int month, double percent) {
        double i = percent / 100 / 12;
        double z = Math.pow(i + 1, month);
        double P = summa * (i + (i / (z - 1)));
        int w = (int) P;
        return w;
    }
}

