import java.util.Scanner;

public class myarray4 {
        public static void main(String[] args) {
            int a[]=new int[5];//array declaration
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Array Elemensts");
            a[0]=sc.nextInt();
            a[1]=sc.nextInt();
            a[2]=sc.nextInt();
            a[3]=sc.nextInt();
            a[4]=sc.nextInt();
            System.out.println("Array Elemensts As Follows");
            for(int p:a)//Advanced for Loop forEach loop
            {
                System.out.println(p);
            }
        }
        
    }

