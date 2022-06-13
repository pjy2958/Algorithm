import java.util.*;
import java.util.Map.Entry;

public class Sort1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCase = Integer.valueOf(sc.nextLine());
        Map<String, Integer> wordAndLength = new HashMap<>();
        for(int count = 0; count < numberOfTestCase; count ++) {
            String testWord = sc.nextLine();
            wordAndLength.put(testWord, testWord.length());
        }

        List<String> wordList = new ArrayList<>();
        while (!wordAndLength.isEmpty()) {
            String wordKey = Collections.min(wordAndLength.keySet());
            wordList.add(wordKey);
            wordAndLength.remove(wordKey);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        Collections.sort(wordList, comparator);
        for(String str : wordList){
            System.out.println(str);
        }
    }
}