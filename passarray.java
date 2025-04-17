public class passarray {
    int a[];
    passarray()
    {
        a=new int[5];
        a[0]=10;
    }
    public void printarray()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        passarray p1=new passarray();
        p1.printarray();
    }
   
    
}
