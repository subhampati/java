import java.util.Scanner;

public class template {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("hello " + name + " how are you");

        }

    }
}
