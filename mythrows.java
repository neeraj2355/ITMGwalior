import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mythrows
 {
    public static void main(String[] args)throws IOException
     {
        System.out.println("Enter your name");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String p=br.readLine();
        System.out.println("Hello"+p);
    }
    
}