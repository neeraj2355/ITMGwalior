import java.util.*;
public class empmgmt {
    int eid;
    String ename;
    int age;
    String city;
     static List<empmgmt> l1;
      static Scanner sc;
    empmgmt()
    {
        l1=new ArrayList<empmgmt>();
       sc=new Scanner(System.in);
    }
 void getemp()
{
    System.out.println("Enter EMP ID,Name,Age,City");
    Scanner sc=new Scanner(System.in);
    eid=sc.nextInt();
    ename=sc.next();
    age=sc.nextInt();
    city=sc.next();
}
 static void addemp(empmgmt p)
{
    l1.add(p);
    System.out.println("Employee Added Successfully");
}
void deleteemp()
{
    System.out.println("Enter EMp ID To Delete");
    int uid=sc.nextInt();
    for (empmgmt p : l1)
     {
        if(p.eid==uid)
        {
            l1.remove(p);
        }
        
    }



}
void updateemp()
{
    System.out.println("Enter EMp ID To Update");
    int eid=sc.nextInt();
    for (empmgmt p : l1)
     {
        if(p.eid==eid)
        {
            System.out.println("Enter New Details For name,Age and City");
            p.ename=sc.next();
            p.age=sc.nextInt();
            p.city=sc.next();
        }
        
    }

}
void viewemp()
{
    for (empmgmt p : l1) {
        System.out.println(p.eid+" "+p.ename+" "+p.age+" "+p.city);
    }

}
public static void main(String[] args)
 {int ch;
    empmgmt e1=new empmgmt();
    System.out.println("-----------Welcome to Emp Management System-----------------------");
    do
    {
    System.out.println("1.Add\n2.Delete\n3.View\n4.Update:\n0. to Exit");
    System.out.println("Enter your choice");
    ch=sc.nextInt();
    switch (ch)
     {
        case 1:
            e1.getemp();
            addemp(e1);
            break;
        case 2:
        e1.deleteemp();
        break;
        case 3:
        e1.viewemp();
        break;
        case 4:
        e1.updateemp();
        break;
        default:
        System.out.println("invalid Choice");
            break;
    }
        
    }while (ch!=0);
    }
}
