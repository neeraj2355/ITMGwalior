public class mythrow {
    public static void main(String[] args)
     {
        System.out.println("First");
        System.out.println("second");
        System.out.println("third");
        try
        {
        NullPointerException itm=new NullPointerException("Serious Error");
        throw itm;//thorw exception manually in program
        //System.out.println("Fourth");
        }catch(NullPointerException e)
        {
            System.out.println("handled");
        }

    }

    
}
