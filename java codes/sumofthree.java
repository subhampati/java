import java.util.Scanner;

public class sumofthree {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter 1st number");
            int a = sc.nextInt();
            System.out.println("enter 2nd number");
            int b = sc.nextInt();
            System.out.println("enter 3rd number");
            int c = sc.nextInt();
            int sum = a + b + c;
            System.out.println("the sum is");
            System.out.println(sum);
        }
    }
}
