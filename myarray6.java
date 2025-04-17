import java.util.Scanner;
public class myarray6 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Array Size");
            int n=sc.nextInt();
            int a[]=new int[n];//array declaration
            System.out.println("Enter Array Elemensts");
            for(int i=0;i<n;i++)
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
