public class MYRoad {

    public  boolean getonroadveicle(int n)throws RoadTrafficJamedException
    {
        if(n<=20)
        {
            return true;
        }
        RoadTrafficJamedException re=new RoadTrafficJamedException("Not More Then 20 Vehicle can pass on this road At a time");
        throw re;
   
    }
    
}
