import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci1003 {
    static int zero = 0;
    static int one = 0;

    static String fibo(int number) {
        if(number == 0)
            return "1 0";
        if(number == 1)
            return "0 1";
        int num1 = 0;
        int num2 = 1;
        int temp1 = 0;
        int temp2 = 0;
        for(int i = 1; i < number; i++){
            if(i == number - 1) {
                temp1 = num2;
                int temp = num2;
                num2 += num1;
                num1 = temp;
                temp2 = num2;
            } else {
                int temp = num2;
                num2 += num1;
                num1 = temp;
            }

        }
        return (temp1 + " " + temp2);
    }
    public static void main(String[] args) throws Exception{
//        for(int i = 0; i <= 10; i++) {
//            fibo(i);
//            System.out.printf("%dcase | zero : %d / one : %d\n", i, zero, one);
//            zero = 0;
//            one = 0;
//        }
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        int numberOfTestcase = Integer.parseInt(sc.nextLine());
        for(int caseNum = 0; caseNum < numberOfTestcase; caseNum++) {
            int number = Integer.parseInt(sc.nextLine());
            list.add(fibo(number));
        }

        for(String str : list){
            System.out.println(str);
        }
    }
}
