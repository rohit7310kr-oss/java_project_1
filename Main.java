public class Main {
    public static void main(String[] args) {

        Feedback[] feedbacks = new Feedback[5];
        feedbacks[0] = new Feedback(5, "Great service!");
        feedbacks[1] = new Feedback(4, "Pretty good.");
        feedbacks[2] = new Feedback(3, "It was okay.");
        feedbacks[3] = new Feedback(2, "Not satisfied.");
        feedbacks[4] = new Feedback(4, "Would recommend.");

        Analyzer analyzer = new Analyzer();

        double average = analyzer.calculateAverage(feedbacks);
        String sentiment = analyzer.categorizeSentiment(average);

        System.out.println("Average Rating: " + average);
        System.out.println("Customer Sentiment: " + sentiment);
    }
}
