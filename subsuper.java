 class mysuper 
{ 
    int p;
    mysuper(int p)
    {
        this.p=p;
    }
    void test()
    {
        System.out.println("using Super Class"+p);
    } 
}
public class subsuper extends mysuper
{ int x;
    subsuper(int x,int y)
    {
        super(y);
        this.x=x;
    }
    void testing()
    {
        System.out.println("using Sub Class"+x);
    } 
    public static void main(String[] args) {
        subsuper s1=new subsuper(10,20);
        s1.test();
        s1.testing();
        
    }
}