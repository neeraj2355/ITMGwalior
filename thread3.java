//java Program to Print Hello ITM using Custom thread
public class thread3 extends Thread
{
    public void run()
    {
        System.out.println("Hello ITM"+"Printed by"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        thread3 tc3=new thread3();//JOB 
        Thread t1=new Thread(tc3);//Assigning JOB TO thread
        t1.setName("EMPployee_rakesh");
        t1.start();
    }
    
}
