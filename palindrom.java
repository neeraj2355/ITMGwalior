//write a java program to input one
// String from user and check
// wheather its  palindrom or not
//NITIN-----NITIN  palindrom
//AMIT------TIMA   //NOT palindrom

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String");
        String op=sc.next();
        System.out.println("You have Entered is="+op);
        StringBuffer sb=new StringBuffer(op);
            sb.reverse();  //reverseing given String
            System.out.println("After Reverse is="+sb);
            String afr=sb.toString();//Again Converted into String Type
            if(op.equals(afr))
                System.out.println("Given String is palindrom");
            else
            System.out.println(" Given String is Not palindrom");
    }
    
}
