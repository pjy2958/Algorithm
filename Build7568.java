import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Build7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCase = Integer.valueOf(sc.nextLine());
        List<Integer> weight = new ArrayList<>();
        List<Integer> height = new ArrayList<>();

        for(int i = 0; i < numberOfTestCase; i++){
            String[] input = sc.nextLine().split(" ");
            weight.add(Integer.valueOf(input[0]));
            height.add(Integer.valueOf(input[1]));
        }

        List<Integer> rank = new ArrayList<>();
        int index = 0;
        int count = 0;
        while (index < numberOfTestCase) {
            for (int i = 0; i < numberOfTestCase; i++) {
                if (index != i) {
                    if (weight.get(index) < weight.get(i) && height.get(index) < height.get(i))
                        count++;
                }
            }
            rank.add(count + 1);
            count = 0;
            index ++;
        }
        for(int personalRank : rank){
            System.out.print(personalRank + " ");
        }
    }
}
