import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vowel1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(true) {
            String str = sc.nextLine();
            str = str.toUpperCase();
            if(str.equals("#"))
                break;
            int pastLength = str.length();
            str = str.replace("A", "");
            str = str.replace("E", "");
            str = str.replace("I", "");
            str = str.replace("O", "");
            str = str.replace("U", "");

            list.add(pastLength - str.length());
        }
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
