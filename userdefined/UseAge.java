import java.util.Scanner;

public class UseAge {
    public static void main(String[] args)throws InvalidAgeException
     {
        System.out.println("Enter your Age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        Age uu=new Age();
        if(uu.testage(age))
        {
            System.out.println("Permitted");
        }
    }
    
}
