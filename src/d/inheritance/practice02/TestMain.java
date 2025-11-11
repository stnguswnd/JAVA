package d.inheritance.practice02;

// TestMain.java
class Movie {
    String title;
    double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public void displayInfo() {
        System.out.println(title + " (평점: " + rating + ")");
    }
}

class ActionMovie extends Movie {
    String specialEffects;

    public ActionMovie(String title, double rating, String specialEffects) {
        super(title, rating);
        this.specialEffects = specialEffects;
    }

    @Override
    public void displayInfo() {
        System.out.println("[액션] " + title + " (평점: " + rating + ") - 특수효과: " + specialEffects);
    }
}

class Comedy extends Movie {
    String humorStyle;

    public Comedy(String title, double rating, String humorStyle) {
        super(title, rating);
        this.humorStyle = humorStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("[코미디] " + title + " (평점: " + rating + ") - 유머: " + humorStyle);
    }
}

class Drama extends Movie {
    String theme;

    public Drama(String title, double rating, String theme) {
        super(title, rating);
        this.theme = theme;
    }

    @Override
    public void displayInfo() {
        System.out.println("[드라마] " + title + " (평점: " + rating + ") - 주제: " + theme);
    }
}

public class TestMain {
    public static void main(String[] args) {
        Movie[] movies = {
                new ActionMovie("어벤져스", 4.5, "최고급 CG"),
                new Comedy("극한직업", 4.7, "상황 코미디"),
                new Drama("기생충", 4.9, "계급 갈등")
        };

        for (Movie movie : movies) {
            movie.displayInfo();

            // instanceof로 타입별 분기
            if (movie instanceof ActionMovie) {
                System.out.println("→ 화려한 전투 장면이 기대됩니다!\n");
            } else if (movie instanceof Comedy) {
                System.out.println("→ 유쾌한 웃음을 선사합니다!\n");
            } else if (movie instanceof Drama) {
                System.out.println("→ 깊은 감동을 느낄 수 있습니다!\n");
            }
        }
    }
}
