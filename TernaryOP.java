import java.util.*;

public class TernaryOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Maximum number is: " + max);

        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("First number (" + a + ") is: " + result);

        sc.close();
    }
}
