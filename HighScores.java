import java.util.Scanner;

public class HighScores {
    public static void main(String[] args) {
    }
}

class Player {
    private String initials;
    private int score;

    public Player(String initials, int score) {
        this.initials = initials;
        this.score = score;
    }

    public String getInitials() {
        return initials;
    }

    public int getScore() {
        return score;
    }
}