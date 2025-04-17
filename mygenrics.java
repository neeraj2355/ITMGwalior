public class mygenrics
 {
<T>void myequals(T x,T y)
{
    if(x==y)
    {
        System.out.println("both Are Equal");
    }
    else
    {
        System.out.println("Not Equals");
    }
    
}
    public static void main(String[] args) {
        mygenrics m1=new mygenrics();
        m1.myequals(10,20);
        m1.myequals(10.9,20.9);
        m1.myequals("Amit","Amit");
        
    }
    
}
