import java.util.Scanner;
public class mycompound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal Amount");
        double principal=sc.nextDouble();

        System.out.println("Enter rate %");
        Double rate=sc.nextDouble();

        System.out.println("Enter Time");
        double time=sc.nextDouble();

        System.out.println("EnterCompound frequency");
        double n=sc.nextDouble();

            double rfc=rate/100;
        double amount=principal*Math.pow((1+rfc/n),n*time);

        System.out.println("Amout="+amount);
        

    }

    
}
