import java.util.*;

public class bracket9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestcase = Integer.parseInt(sc.nextLine());
        List<String> bracketList = new ArrayList<>();

        Queue<Character> que = new LinkedList<>();
        for (int caseCount = 1; caseCount <= numberOfTestcase; caseCount++) {
            bracketList.add(sc.nextLine());
        }
        for (String str : bracketList) {
            for (int charIndex = 0; charIndex < str.length(); charIndex++) {
                char pointOfChar = str.charAt(charIndex);
                if (pointOfChar == '(') {
                    que.add(pointOfChar);
                } else {
                    if (que.isEmpty()) {
                        System.out.println("NO");
                        break;
                    } else {
                        que.remove();
                    }
                }
                if(charIndex == str.length() - 1){
                    if(que.isEmpty())
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
            que.clear();
        }
    }
}
