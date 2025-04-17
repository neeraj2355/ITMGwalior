public class Age
 { 
public boolean testage(int getage)throws InvalidAgeException
{
   
    
    if(getage>=18)
    {
        return true;
    }
    else
    {
        InvalidAgeException e= new InvalidAgeException("Age is Less then 18 years");
        throw e;
    }
}
}
