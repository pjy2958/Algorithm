import java.util.Scanner;

public class Chess1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int row = Integer.valueOf(input[0]);
        int column = Integer.valueOf(input[1]);

        char[][] chessPan = new char[row][column];
        for(int i = 0; i < row; i++){
            chessPan[i] = sc.nextLine().toCharArray();
        }

        int startRow = 0;
        int startColumn = 0;
        int endRow = row - 8;
        int endColumn = column - 8;
        int changeCount = 0;
        int minCount = 0;
        while(startRow <= endRow ){
            char color = chessPan[startRow][startColumn];

            for(int i = startRow; i < startRow + 8; i++){
                for(int j = startColumn; j < startColumn + 8; j++){
                    if(color != chessPan[i][j]){
                        changeCount++;
                    }
                    if(color == 'B')
                        color = 'W';
                    else
                        color = 'B';
                }
                if(color == 'B')
                    color = 'W';
                else
                    color = 'B';
            }
            int whiteCase = changeCount;
            if(startRow == 0 && startColumn == 0)
                minCount = whiteCase;
            if(whiteCase < minCount)
                minCount = whiteCase;
            changeCount = 0;

            color = chessPan[startRow][startColumn];
            if(color == 'B')
                color = 'W';
            else
                color = 'B';
            for(int i = startRow; i < startRow + 8; i++){
                for(int j = startColumn; j < startColumn + 8; j++){
                    if(color != chessPan[i][j]){
                        changeCount++;
                    }
                    if(color == 'B')
                        color = 'W';
                    else
                        color = 'B';
                }
                if(color == 'B')
                    color = 'W';
                else
                    color = 'B';
            }
            int blackCase = changeCount;
            if(blackCase < minCount)
                minCount = blackCase;

            changeCount = 0;
            startColumn++;

            if(endColumn < startColumn){
                startColumn = 0;
                startRow ++;
            }
        }
        System.out.println(minCount);
    }
}
