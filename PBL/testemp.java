import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class testemp 
{
    List<myemp> l1;
    Scanner sc;
    public static final String RED = "\033[31m";
    public static final String RESET = "\033[0m";  // Reset to default color
    testemp( )
    {
        l1=new ArrayList<myemp>();
        sc=new Scanner(System.in);
    }
    void addemp()
    {
        System.out.println(RED + "Enter Employee Details as Name and Designation" + RESET);
        
        String name=sc.next();
        String desg=sc.next();
        myemp e=new myemp(name,desg);
        l1.add(e);
        System.out.println(RED+"Employee Added SuccessFully"+RESET);
    } 
    void delemp()
    {
        System.out.println("Eneter Emp ID you want to Delete");
        int did=sc.nextInt();
        for (myemp e : l1)
         {
            if(e.eid==did)
            {
                l1.remove(e);
                System.out.println("Employee With Given ID Deleted Successfully");
                return;
            }
            
        }
        System.out.println("NO such Employee With Given ID Exist");

    }
    void showemp()
    {
        System.out.println("!!!!!!!!!!!!!!!Employee as follows!!!!!!!!!!!!!!!!!!!!");
        System.out.printf("%-6s | %-15s | %-12s %n", "ID", "Name", "Designation");
        System.out.println("--------------------------------------------------------");

        //System.out.println("EMP ID"+""+"EMP Name"+""+"Designation");
        for (myemp e : l1)//e1//e2//e3//e4
         {
            System.out.printf("%-6d | %-15s | %-12s %n",e.eid,e.ename,e.Designation);
            
        }


    }
    void updateemp()
    {
        System.out.println("Enter ID  of Employee and New Designation you want to Promote");
        int did=sc.nextInt();
        String ndgn=sc.next();
        for (myemp e : l1)
        {
           if(e.eid==did)
           {
               e.Designation=ndgn;
               System.out.println("Employee Updated Successfully");
               return;
           }
           System.out.println("NO such Employee With Given ID Exist");
           
       }

    }
    public static void main(String[] args) {
        testemp mp=new testemp();
        int ch;
        System.out.println("!!!!!!!!!!!!!Welcome to Employee management System!!!!!!!!!!!!!!!!!!!!!");
        do
        {
        System.out.println("[1] Add Employee\n[2]DeleteEmployee\n[3]View Employee\n[4]Update Employee\n[0] TO Exit ");
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
         ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            mp.addemp();
            break;
            case 2:
            mp.delemp();
            break;
            case 3:
            mp.showemp();
            break;
            case 4:
            mp.updateemp();
            break;
            case 0:
            System.exit(ch);

            default:
            System.out.println("invalid Chice");
        }
    }while(ch!=0);
    
}
}
