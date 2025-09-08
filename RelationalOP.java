import java.util.*;
public class RelationalOP{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println(" ENTER VALUE OF A AND B AND C: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}