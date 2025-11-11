package d.inheritance.practice04_2;

interface Payment {
    void processPayment(int amount);          // 결제 처리 (추상 메서드)
    String getPaymentMethod();                // 결제 수단 이름 반환 (추상 메서드)

    // 디폴트 메서드 (모든 결제 수단에서 공통적으로 사용)
    default void printReceipt(int amount) {
        System.out.println("영수증: " + amount + "원 - " + getPaymentMethod());
    }
}
