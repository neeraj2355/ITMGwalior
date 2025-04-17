import java.util.Scanner;

public class usemarks {
    public static void main(String[] args) {
        System.out.println("Enter your Exam marks");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        marks mm=new marks();
        try{
        if(mm.getmarks(m))
        {
            
System.out.println("!!!!!!!!congrats You passed!!!!!!!!!!!!!");
        }
    }catch(InvalidMarksException e)
    {

        System.out.println("Soory: you Declared fail");
    }
    }
    
}
