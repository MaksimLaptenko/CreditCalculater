public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summa = 1_000_000; // сумма кредита
        int month = 12; // количество месяцев
        double percent = 9.99; // процентная ставка
        int w = service.calculate(summa,month,percent);
        System.out.println(w);

        CreditPaymentService service2 = new CreditPaymentService();
        int summa2 = 1_000_000; // сумма кредита
        int month2 = 24; // количество месяцев
        double percent2 = 9.99; //процентная ставка
        int w2 = service.calculate(summa2,month2, percent2);
        System.out.println(w2);

        CreditPaymentService service3 = new CreditPaymentService();
        int summa3 = 1_000_000; // сумма кредита
        int month3 = 36; // количество месяцев
        double percent3 = 9.99; // процентная ставка
        int w3 = service.calculate(summa3,month3,percent3);
        System.out.println(w3);
    }
}
