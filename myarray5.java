import java.util.Scanner;
public class myarray5 {
        public static void main(String[] args) {
            int a[]=new int[10];//array declaration
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Array Elemensts");
            for(int i=0;i<=9;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Array Elemensts As Follows");
            for(int p:a)//Advanced for Loop forEach loop
            {
                System.out.println(p);
            }
        }
        
    }


    
