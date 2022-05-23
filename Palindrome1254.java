import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Palindrome1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        List<Character> charList = new LinkedList<>();

        for(int i = 0; i < str.length(); i++) {
            charList.add(str.charAt(i));
        }

        int indexNum = 0;
        int halfOfLength = charList.size() / 2 + 1;
        while(indexNum < halfOfLength) {
            if(charList.get(indexNum) != charList.get(charList.size() - 1 - indexNum)) {
                charList.add(charList.size() - indexNum, charList.get(indexNum));
            }
            indexNum += 1;
            halfOfLength = charList.size() / 2 + 1;
        }
        for(Character ch : charList) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.print(charList.size());
    }
}