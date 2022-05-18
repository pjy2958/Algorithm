import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        List <String> list = new ArrayList<>();
        while (true) {
            num = Integer.parseInt(sc.nextLine());
            if(num == 0)
                break;
            String palindrome = String.valueOf(num);
            for(int i = 0; i < palindrome.length(); i++){
                if(palindrome.length() == 1){
                    list.add("yes");
                    break;
                }
                if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1 - i)) {
                    list.add("no");
                    break;
                }
                if(i == palindrome.length() - 1)
                    list.add("yes");
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}