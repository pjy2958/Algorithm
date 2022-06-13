import java.util.Scanner;

public class Factorial10872 {
    public static void main(String[] args) {
        int number = Integer.valueOf(new Scanner(System.in).nextLine());
        if(number==0){
            System.out.print(1);
            return;
        }

        long result = 1;
        for(int i = 1; i<=number; i++){
            result *= i;
        }

        System.out.print(result);
    }
}
