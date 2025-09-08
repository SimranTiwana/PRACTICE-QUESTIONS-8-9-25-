import java.util.*;
public class UnaryOP{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE OF A: ");
        int a = sc.nextInt();
        System.out.println("ENTER VALUE OF B: ");
        int b = sc.nextInt();
        System.out.println("PRE INCREMENT VALUE OF A: "+(++a)+" B: "+(++b));
      //  System.out.println("POST INCREMENT VALUE OF A: "+(a++)+" B: "+(b++));
        System.out.println("PRE DECREMENT VALUE OF A: "+(--a)+" B: "+(--b));
      //  System.out.println("POST DECCREMENT VALUE OF A: "+(a--)+" B: "+(b--));
        

        


    }
}