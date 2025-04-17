public class marks {
    public boolean getmarks(int mark)throws InvalidMarksException
    {
        if(mark>=40)
        {
        return true;
        }
        throw new InvalidMarksException("marks Should Be Higher then 40 to get pass");
        
        
    
}
}
