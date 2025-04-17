//java program to enter any chareacter from keyboard
//and find weather its is Alphabhat didit or Special Character
import java.util.Scanner;
public class chkalpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any character from keyboard");
        char s1=sc.next().charAt(0);
        int x =(int)s1;   //typr conversion
        System.out.println(" Ascii value is="+x);
        if(x>=65 && x<=90)
        {
            System.out.println("Capital Alphabhat");
        }
        else if(x>=97 && x<=122)
        {
            System.out.println("Small Alphabhat");
        }
        else if(x>=48 && x<=57)
        {
            System.out.println("Its A Digit");
        }
        else
        {
            System.out.println("its Special Character");
        }
     
    }
    
}
