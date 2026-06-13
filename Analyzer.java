public class Analyzer {

    double calculateAverage(Feedback[] feedbacks) {
        int total = 0;
        for (int i = 0; i < feedbacks.length; i++) {
            total = total + feedbacks[i].getScore();
        }
        return (double) total / feedbacks.length;
    }

    String categorizeSentiment(double average) {
        int score = (int) Math.round(average);
        String result;

        switch (score) {
            case 5:
                result = "Excellent";
                break;
            case 4:
                result = "Good";
                break;
            case 3:
                result = "Average";
                break;
            default:
                result = "Poor";
        }

        return result;
    }
}
