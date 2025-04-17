import java.util.Scanner;
public class mypassword
 {
    public static void main(String[] args)
     {
        try{
            for(int i=0;i<=2;i++)
            {
        System.out.println("Enter Your password");
        Scanner sc=new Scanner(System.in);//12
        String pass=sc.next();
       MYCHK mr=new MYCHK();
        
        if(mr.chkpassword(pass))
        {
            System.out.println("!!!!!!! Well Done Goi Ahead!!!!!!!!");
        }
        System.out.println("Try Again");
    }
    }catch(InvalidPasswordException pe)
    {
        System.out.println("!!!Account Blocked for 24 hrs");
    }

        }
    }
