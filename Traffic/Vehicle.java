import java.util.Scanner;
public class Vehicle
 {
    public static void main(String[] args)
     {
        System.out.println("Enter How many Vehicle Running on Road");
        Scanner sc=new Scanner(System.in);//12
        int no=sc.nextInt();
        MYRoad mr=new MYRoad();
        try{
        if(mr.getonroadveicle(no))
        {
            System.out.println("!!!!!!!NO Traffic Run Smoothly!!!!!!!!");
        }
    }catch(RoadTrafficJamedException re)
    {
        System.out.println("!!!Soory No More Vehicle permitted");
    }

        }
    }
