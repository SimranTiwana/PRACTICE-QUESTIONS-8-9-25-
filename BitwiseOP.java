import java.util.*;

public class BitwiseOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("a & b = " + (a & b));   // AND
        System.out.println("a | b = " + (a | b));   // OR
        System.out.println("a ^ b = " + (a ^ b));   // XOR
        System.out.println("~a = " + (~a));         // NOT
        System.out.println("a << 1 = " + (a << 1)); // Left shift
        System.out.println("b >> 1 = " + (b >> 1)); // Right shift

        sc.close();
    }
}
