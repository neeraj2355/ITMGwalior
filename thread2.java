// Suspend the Execution of A Thread For Given Duaration of time
public class thread2 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
            
            }
            System.out.println("Numbers Printed BY"+Thread.currentThread().getName());
        }
        
    }

    
