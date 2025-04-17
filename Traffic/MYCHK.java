public class MYCHK {

    public  boolean chkpassword(String p)throws InvalidPasswordException
    {
        for(int i=0;i<=2;i++)
        {
            if(p.equals("ITMU"))
            return true;
            System.out.println("Incorrect:Try Again");
        }
        InvalidPasswordException pe=new InvalidPasswordException("Wrong password");
        throw pe;
   
    }
    
}
