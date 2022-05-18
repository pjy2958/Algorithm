import java.util.*;

public class Stack1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < count; i++){
            que.add(Integer.parseInt(sc.nextLine()));
        }

        List<Character> arrlist = new ArrayList<>();
        int num = 1;
        while (arrlist.size() != count) {
            if(que.peek() != que.peek()) {

            }
        }
    }
}
