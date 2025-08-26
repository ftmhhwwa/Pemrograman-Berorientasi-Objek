import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        int sumOfLengths = A.length() + B.length();
        System.out.println("Output: ");
        System.out.println(sumOfLengths);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capitalizedA + " " + capitalizedB);
    }
}