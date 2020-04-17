import java.util.Scanner;
import java.util.Arrays;
public class TestScores {
    public static void main(String[] args) {
        int counter = 0;
        double min = Double.MAX_VALUE;
        double max = 0;
        double[] scores = new double[10];
        double sum = 0;
        Scanner keybd = new Scanner(System.in);
        String prefixStr = "Enter a score (";
        String sufffixStr = "/10): ";
        String prompt = "";

        for (int i = 0; i < scores.length; i++) {
            counter++;
            prompt = prefixStr + counter + sufffixStr;
            System.out.print(prompt);
            scores[i] = keybd.nextDouble();
            sum += scores[i];
            if ( scores[i] < min)
                min = scores[i];
            if ( scores[i] > max)
                max = scores[i];

        }
        System.out.println("The highest score is " + max);
        System.out.println("The lowest score is " + min);
        System.out.println("The average score is " + sum/counter);
        System.out.println("All the scores are " + Arrays.toString(scores));
    }

}
