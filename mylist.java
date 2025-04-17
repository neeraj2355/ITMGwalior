import java.util.*;
class emp
{
    int id;
    String ename;
}

public class mylist {
    public static void main(String[] args) {
        emp e1=new emp();
        e1.id=1001;
        e1.ename="Amit";
        emp e2=new emp();
        e2.id=1002;
        e2.ename="Sumit";
        emp e3=new emp();
        e3.id=1003;
        e3.ename="Punit";
        emp e4=new emp();
        e4.id=1004;
        e4.ename="Suresh";
        emp e5=new emp();
        e5.id=1005;
        e5.ename="rakesh";
        List<emp> l1=new Stack<emp>();
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);
        l1.add(e5);
        Iterator<emp>itr=l1.iterator();
        for (emp e  : l1) {
            System.out.println(e.id+""+e.ename);
            
        }
        //l1.clear();
        System.out.println("After Clearing list is ");
        for (emp e  : l1) {
            System.out.println(e.id+""+e.ename);
            
        }
        System.out.println("List is Empty "+l1);
        Iterator<emp> itr1=l1.iterator();
        System.out.println(itr1.next());
        

      
    }
    
}
