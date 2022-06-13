import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACMHotel10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestcase = Integer.parseInt(sc.nextLine());

        List<String> roomNumberList = new ArrayList<>();

        for(int count = 0; count < numberOfTestcase; count++){
            int height = sc.nextInt();
            int width = sc.nextInt();
            int index = sc.nextInt();
            solution(height, index, roomNumberList);
        }
        for(String str : roomNumberList){
            System.out.println(str);
        }
    }

    public static void solution(int height, int index, List<String> roomNumberList){
        int roomNumberOfHeight = index % height;
        if(roomNumberOfHeight == 0)
            roomNumberOfHeight = height;

        String roomNumberOfWidth = "";
        int roomNumber = height;
        if(roomNumberOfHeight != height)
            roomNumber = index / height + 1;
        if (roomNumber < 10)
            roomNumberOfWidth = "0" + String.valueOf(roomNumber);
        else
            roomNumberOfWidth = String.valueOf(roomNumber);
         roomNumberList.add(String.valueOf(roomNumberOfHeight) + roomNumberOfWidth);
    }
}