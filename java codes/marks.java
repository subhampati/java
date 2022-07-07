import java.util.Scanner;

public class marks {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter 1st subject");
            int a = sc.nextInt();
            System.out.println("enter 2nd subject");
            int b = sc.nextInt();
            System.out.println("enter 3rd subject");
            int c = sc.nextInt();
            System.out.println("enter 4th subject");
            int d = sc.nextInt();
            System.out.println("enter total mark");
            int sum = a + b + c + d;
            System.out.println(sum);
            float percent = ((sum * 100) / 400);
            System.out.println(percent);

        }
    }

}
