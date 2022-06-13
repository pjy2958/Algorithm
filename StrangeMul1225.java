import java.util.Scanner;

public class StrangeMul1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        long sumStr1 = 0;
        for(int i = 0; i < str1.length(); i++) {
            sumStr1 += Character.getNumericValue(str1.charAt(i));
        }
        long sumStr2 = 0;
        for(int i = 0; i < str2.length(); i++) {
            sumStr2 += Character.getNumericValue(str2.charAt(i));
        }
        System.out.print(sumStr1 * sumStr2);
    }
}
