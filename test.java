public class test
{
   private  int x,y;
    public test( )
    {
        x = 1;
        y = 200;
    }
    public test(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public void Show()
    {
       test t1=new test();
        test t2 = new test();
        int z;
        z = x + y;
        System.out.println("Addition is="+z);
    }
}

class Program
{
     public static void Main(String[] args)
    {
        test t1 = new test(4,5);
        t1.Show();

    }
}