import java.util.Scanner;

public class Blank1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Solution sol = new Solution();
        sol.Solution(str.trim());
    }
}

class Solution {
    public void Solution(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count ++;
            if(i == str.length()-1)
                count++;
        }
        System.out.println(count);
    }
}
