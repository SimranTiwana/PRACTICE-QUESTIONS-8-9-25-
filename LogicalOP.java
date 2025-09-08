import java.util.*;

public class LogicalOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean x = sc.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean y = sc.nextBoolean();

        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
        System.out.println("!y = " + (!y));

        sc.close();
    }
}
