
import java.util.*;
public class myinput {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers you want maximum");
       Scanner s1=new Scanner(System.in);//OBJECT OF sCANNER cLASS
       int x=s1.nextInt();
       int y=s1.nextInt();   //taking input From user 
       int z=s1.nextInt();
       if(x>y &&x>z)       //Checking from variable
       {
        System.out.println("First Value is Maximum");
       }
       else if(y>x && y>z)
       {
        System.out.println("Second value is maximum");
       }
       else
       {
        System.out.println("third Is maximum");
       }
    }
    
}
