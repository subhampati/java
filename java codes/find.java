import java.util.Scanner;

public class find {

    public static void main(String[] args) {
        int[] myArray = { 12, 17, 15, 24, 23 };
        int i;

        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scn.nextInt();
        for (int i = 0; myArray.length; i++) {
            if (num == myArray[i]) {
                System.out.println("its present");

            }

        }
    }

}
