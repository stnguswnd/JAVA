package d.inheritance.practice04_2;

class CashPayment implements Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("현금 " + amount + "원 결제 완료");
    }

    @Override
    public String getPaymentMethod() {
        return "현금";
    }
}