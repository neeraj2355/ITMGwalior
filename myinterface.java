interface test
{
    public void show();
   void display();
}
public class myinterface implements test
 {
    public void show()
    {
        System.out.println("I am OverRidden");
    }
    public void display()
    {
        System.out.println("I am second method of interface");
    }
    
    public static void main(String[] args) {
        myinterface m1=new myinterface();
        m1.show();
        m1.display();
    }
    
}
