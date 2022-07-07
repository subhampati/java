import java.util.Arrays;

public class string {
    int a = 19;

    public static void main(String[] args) {
        int[] my_array1 = { 13, 89, 76, 56 };
        String[] my_array2 = { "Rajat", "Kaushik", "Subham", "Bisua" };
        System.out.println("origional integer array: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("sorted string array: " + Arrays.toString(my_array1));
        System.out.println("origional integer array: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("sorted string array: " + Arrays.toString(my_array2));
    }

}
