import java.util.Scanner;

public class ScoreOfExamination9498 {
    public static void main(String[] args) {
        int score = Integer.parseInt(new Scanner(System.in).nextLine());
        char result = score < 60 ? 'F' : score < 70 ? 'D' : score < 80 ? 'C' : score < 90 ? 'B' : 'A';
        System.out.print(result);
    }
}
