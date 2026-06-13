public class Feedback {
    int score;
    String comment;

    Feedback(int score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    int getScore() {
        return score;
    }

    String getComment() {
        return comment;
    }
}
