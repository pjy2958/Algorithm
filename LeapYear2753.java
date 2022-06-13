import java.util.Scanner;

public class LeapYear2753 {
    public static void main(String[] args) {
        int year = Integer.parseInt(new Scanner(System.in).nextLine());
        if(year % 4 != 0){
            System.out.print(0);
            return;
        }
        int result = (year%100 != 0) || (year % 400 == 0) ? 1 : 0;
        System.out.print(result);
    }
}
