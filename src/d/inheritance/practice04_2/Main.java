package d.inheritance.practice04_2;

// 메인 클래스 (테스트용)
public class Main {
    public static void main(String[] args) {
        Payment[] payments = {
                new CreditCardPayment("1234-5678"),
                new CashPayment()
        };

        int amount = 50000;

        for (Payment payment : payments) {
            payment.processPayment(amount);   // 결제 수행
            payment.printReceipt(amount);     // 영수증 출력
            System.out.println();
        }
    }
}