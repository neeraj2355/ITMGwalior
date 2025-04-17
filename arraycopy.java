//java program to take two array of sige 5
//take values from user for array 1
//copy array1 valiues into 2 array
//print 2 array

import java.util.Scanner;

public class arraycopy {
    int []a;
    int []b;
    arraycopy()
    {
        a=new int[5];
        b=new int[5];
    }
    void getarray()
    {
        System.out.println("enter Array values");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void copyarray()
    {
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }

    }
    void printarray()
    {
        for (int p : b) {
            System.out.println(p);
            
        }
    }
    public static void main(String[] args) {
        arraycopy a1=new arraycopy();
        a1.getarray();
        a1.copyarray();
        a1.printarray();
    }

    
}
