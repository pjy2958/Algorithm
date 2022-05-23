import java.util.Scanner;
public class CommandPrompt1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCase = Integer.parseInt(sc.nextLine());
        char[] chArr = new char[50];

        String firstStr = sc.nextLine();
        for(int i = 0; i < firstStr.length(); i++) {
            chArr[i] = firstStr.charAt(i);
        }

        for(int i = 1; i < numberOfTestCase; i ++) {
            String newStr = sc.nextLine();
            for(int j = 0; j < firstStr.length(); j ++) {
                if(chArr[j] != newStr.charAt(j))
                    chArr[j] = '?';
            }
        }
        for(char ch : chArr) {
            if(ch == '\u0000')
                break;
            System.out.print(ch);
        }
    }
}
