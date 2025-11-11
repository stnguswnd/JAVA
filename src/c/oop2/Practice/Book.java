package c.oop2.Practice;

public class Book {
    private String title;
    private String author;
    private int price;
    private String isbn;

    //  1. 생성자 (제목, 저자만)
    public Book(String title, String author) {
        this(title, author, 0, null);
    }

    //  2. 생성자 (제목, 저자, 가격)
    public Book(String title, String author, int price) {
        this(title, author, price, null);
    }

    //  3. 생성자 (모든 필드)
    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    //  책 정보 출력
    public void displayInfo() {
        displayInfo(false);
    }

    // 오버로딩된 상세 출력
    public void displayInfo(boolean detailed) {
        System.out.print(title + " - 저자: " + author + ", 가격: " + price + "원");
        if (detailed && isbn != null) {
            System.out.print(", ISBN: " + isbn);
        }
        System.out.println();
    }

    // 할인 메서드 (percent 단위)
    public void applyDiscount(int percent) {
        price -= price * percent / 100;
    }

    //  오버로딩된 할인 메서드
    public void applyDiscount(int amount, boolean isPercent) {
        if (isPercent) {
            applyDiscount(amount);
        } else {
            price -= amount;
            if (price < 0) price = 0;
        }
    }

    // Getter들
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}