import java.util.*;
public class myemp
 {
    int eid;//1001
    String ename;//Amit
    String Designation;//manager 
    static int id=0; 
    List<myemp> l1;
    Scanner sc;

    myemp(String name,String post)//Amit//manager
    {
        eid=++id;
        ename=name;
        Designation=post;
    }
    myemp()
    {
        l1=new ArrayList<myemp>();
         sc=new Scanner(System.in);
    }
    void addemp()
    {
        System.out.println("Enter Emplyee  Details as  Name and Designation");
        
        String name=sc.next();
        String desg=sc.next();
        myemp e=new myemp(name,desg);
        l1.add(e);
        System.out.println("Employee Added SuccessFully");
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
        System.out.println("EMP ID"+"  "+"EMP Name"+"  "+"Designation");
        for (myemp e : l1)//e1//e2//e3//e4
         {
            System.out.print(e.eid+"  "+e.ename+"  "+e.Designation+"\n");
            
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
        myemp mp=new myemp();
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

