import java.util.*;
public class myemp
 {
    int eid;//1001
    String ename;//Amit
    String Designation;//manager 
    static int id=0; 

    myemp(String name,String post)
    {
        eid=++id;
        ename=name;
        Designation=post;
    }  
    myemp()
    {

    }  
}

