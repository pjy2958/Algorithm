import java.util.Scanner;

public class BinaryCode1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder octal = new StringBuilder();
        octal.append(sc.nextLine());
        if(octal.length() == 1){
            if(octal.charAt(0) == '0'){
                System.out.println(octal);
                return;
            }
        }
        String[] octalTobinary = new String[]{"000", "001", "010", "011", "100", "101", "110", "111"};

        StringBuilder binaryResult = new StringBuilder();
        for(int i = 0; i < octal.length(); i++) {
            binaryResult.append(octalTobinary[Character.getNumericValue(octal.charAt(i))]);
        }

        while(true) {
            if(binaryResult.charAt(0) != '0')
                break;
            binaryResult.deleteCharAt(0);
        }
        System.out.println(binaryResult);
    }
}
