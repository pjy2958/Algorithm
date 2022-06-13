import java.util.Scanner;

public class GuguDan2739 {
    public static void main(String[] args) {
        int dan = Integer.valueOf(new Scanner(System.in).nextLine());
        solution(dan, 1);
    }

    public static void solution(int dan, int count){
        if(count == 9){
            System.out.printf("%d * %d = %d", dan, count, dan * count);
            return;
        }
        System.out.printf("%d * %d = %d\n", dan, count, dan * count);
        solution(dan, count+1);
    }
}
