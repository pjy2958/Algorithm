import java.util.Scanner;

public class BlackJack2789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfcase = sc.nextInt();
        int number = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[numberOfcase];

        for (int caseCount = 0; caseCount < numberOfcase; caseCount++) {
            arr[caseCount] = sc.nextInt();
        }
        int pivot1 = 0; int pivot2 = 1; int pivot3 = 2;
        int wantNumber;
    }
}
