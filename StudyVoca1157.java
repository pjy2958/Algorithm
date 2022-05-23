import java.util.*;

public class StudyVoca1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String voca = sc.nextLine();
        voca = voca.toUpperCase();

        int maxCount = 0;
        String resultVoca = "";
        boolean bo = false;

        while(voca.length() != 0) {
            int pastLength = voca.length();

            String firstVoca = String.valueOf(voca.charAt(0));
            voca = voca.replace(firstVoca, "");
            if(pastLength - voca.length() == maxCount){
                bo = true;
            }
            if(pastLength - voca.length() > maxCount) {
                maxCount = pastLength - voca.length();
                resultVoca = firstVoca;
                bo = false;
            }
        }
        if(bo == false) {
            System.out.print(resultVoca);
        } else
            System.out.println("?");
    }
}