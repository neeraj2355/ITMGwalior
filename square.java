import java.util.*;
public class square {
    public static void main(String[] args) {
        System.out.println("Enter Any number");
        System.out.println("Enter Power");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int power=sc.nextInt();
        System.out.println(Math.sqrt(number));//Square root
        System.out.println(Math.cbrt(number));//Cube root
        System.out.println(Math.pow(number, power));

    }
}
