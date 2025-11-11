package c.oop2.Practice;

public class Library {
    private Book[] books;
    private int bookCount;

    // ✅ 생성자
    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    // ✅ 책 추가 (Book 객체)
    public void addBook(Book book) {
        if (bookCount >= books.length) {
            System.out.println("더 이상 책을 추가할 수 없습니다.");
            return;
        }
        books[bookCount++] = book;
    }

    // 책 추가 (제목, 저자)
    public void addBook(String title, String author) {
        addBook(new Book(title, author));
    }

    // 책 추가 (제목, 저자, 가격)
    public void addBook(String title, String author, int price) {
        addBook(new Book(title, author, price));
    }

    // 전체 도서 출력
    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.print((i + 1) + ". ");
            books[i].displayInfo();
        }
    }

    // 제목으로 검색
    public void searchByTitle(String keyword) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.print((i + 1) + ". ");
                books[i].displayInfo();
            }
        }
    }

    // 저자로 검색
    public void searchByAuthor(String keyword) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.print((i + 1) + ". ");
                books[i].displayInfo();
            }
        }
    }

    // 전체 가격 합계
    public int getTotalPrice() {
        int sum = 0;
        for (int i = 0; i < bookCount; i++) {
            sum += books[i].getPrice();
        }
        return sum;
    }

    // 평균 가격
    public int getAveragePrice() {
        if (bookCount == 0) return 0;
        return getTotalPrice() / bookCount;
    }

    // 책 개수 반환
    public int getBookCount() {
        return bookCount;
    }

    // 모든 책에 할인 적용
    public void applyDiscountToAll(int percent) {
        for (int i = 0; i < bookCount; i++) {
            int oldPrice = books[i].getPrice();
            books[i].applyDiscount(percent);
            System.out.println(books[i].getTitle() + ": " + oldPrice + "원 → " + books[i].getPrice() + "원");
        }
    }
}