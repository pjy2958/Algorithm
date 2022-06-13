import java.util.*;

public class OXQuiz8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCase = Integer.parseInt(sc.nextLine());

        List<Integer> scoreList = new ArrayList<>();

        for(int i = 0; i < numberOfTestCase; i++) {
            String oxStr = sc.nextLine();
            scoreList.add(solution(oxStr));
        }

        for(Integer score : scoreList)
            System.out.println(score);
    }
    public static int solution(String oxStr){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < oxStr.length(); i++) {
            if(oxStr.charAt(i) == 'O'){
                count ++;
                sum += count;
            } else
                count = 0;
        }
        return sum;
    }
}
