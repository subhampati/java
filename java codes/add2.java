import java.util.Scanner;

public class add2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a number");
            int a = sc.nextInt();
            System.out.println("enter 2nd number");
            int b = sc.nextInt();
            int Sum = (a + b);
            System.out.println(Sum);
        }

    }
}
