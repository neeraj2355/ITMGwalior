import java.util.ArrayList;
import java.util.*;

public class studentmgmt {
    int sid;
    String sname;
    int age;
    double percentage;
    List<studentmgmt> l1;
    studentmgmt()
    {
        l1=new ArrayList<studentmgmt>();
        LinkedList<String> l2=new LinkedList<String>();
        l2.add("Chaina");
        l2.add("India");
        l2.addFirst("USA");
        l2.add(0,"Nepal");
        for (String p : l2) {
            System.out.println(l2);
            
        }
    }
    void addstudent()
    {  System.out.println("How many Student you want to add");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         studentmgmt s[]=new studentmgmt[n];
         for(int i=0;i<n;i++)
         {
        s[i]=new studentmgmt();
        System.out.println("Enter Student ID ,name ,age and percentage");
        s[i].sid=sc.nextInt();
        s[i].sname=sc.next();
        s[i].age=sc.nextInt();
        s[i].percentage=sc.nextDouble();
        l1.add(s[i]);
        System.out.println("One Student Entered Successfully");
         }
         return;

    }
    void deletestudent(int did)
    {
       for (studentmgmt p : l1) {
        if(p.sid==did)
        {
            l1.remove(p);
            System.out.println("Student dleteted Successfully");
        }
        
       }

    }
    void viewstudent()
    { 
        System.out.println("ID"+"   "+"name"+"      "+"Age"+"    "+"percentage");
        for (studentmgmt p : l1) {
            if(p!=null)
            {
            
            System.out.println(p.sid+"  "+p.sname+"   "+p.age+"   "+p.percentage);
        }
        else
        {
            System.out.println("List is Empty");
        }
    }

    }
   void  updatestudent(int uid)
    {

        for (studentmgmt p : l1) {
            Scanner sc=new Scanner(System.in);
            if(p.sid==uid)
            {
                System.out.println("Enter New Details");
                p.sname=sc.next();
                p.age=sc.nextInt();
                p.percentage=sc.nextDouble();
                System.out.println("Record Updated Successfully");
                viewstudent();

            }
            
        }
    }
    public static void main(String[] args) {
        studentmgmt s=new studentmgmt();
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------------Welcome to Student management System------------------------");
        do{
        System.out.println("1.Add Student\n2.Remove Student\n3.View Student\n4 Update Student\n0.Exit");
        System.out.println("Enter Your Choice");
        ch=sc.nextInt();
        switch (ch) {
            case 1:
            s.addstudent();
                break;
            case 2:
            System.out.println("Enter ID you want to delete");
            int did=sc.nextInt();
            s.deletestudent(did);
            break;
            case 4:
             System.out.println("Enter ID for which you want update");
             int id=sc.nextInt();
             s.updatestudent(id);
             break;
             case 3:
             s.viewstudent();

             break;
            default:
            System.out.println("Invlid Choice");
        }
        }while(ch!=0); 
    

    }
}

