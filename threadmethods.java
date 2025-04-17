public class threadmethods extends Thread {
    public void run()
    {
        System.out.println("hello");
        
    }
    public static void main(String[] args) {
      Thread t1=new Thread();
      t1.start();
      t1.setDaemon(true);
      
    }
    
}
