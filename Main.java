import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many feedback entries? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Feedback[] feedbacks = new Feedback[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nFeedback #" + (i + 1) + ":");
            int score;
            while (true) {
                System.out.print("  Score (1-5): ");
                score = scanner.nextInt();
                scanner.nextLine();
                if (score >= 1 && score <= 5) {
                    break;
                }
                System.out.println("  Please enter a score between 1 and 5.");
            }

            System.out.print("  Comment: ");
            String comment = scanner.nextLine();
            feedbacks[i] = new Feedback(score, comment);
        }

        Analyzer analyzer = new Analyzer();
        double average = analyzer.calculateAverage(feedbacks);
        String sentiment = analyzer.categorizeSentiment(average);

        System.out.println("\nAverage Rating: " + average);
        System.out.println("Customer Sentiment: " + sentiment);

        scanner.close();
    }
}
