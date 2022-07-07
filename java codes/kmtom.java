import java.util.Scanner;

public class kmtom {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the kelometer");
            int k = sc.nextInt();
            int convert = k * 1000;
            System.out.println("meter is " + convert);
        }

    }
}
