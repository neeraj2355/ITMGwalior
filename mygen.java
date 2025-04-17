class mygen
{ 
    int a, b;
    <T>void compare(T a, T b)
    {
        if(a.equals(b))
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
    public static void main(String[] args) {
        //mygen<Integer> m1=new mygen<>();
        //m1.compare(10,10);

        //mygen<Double> m2=new mygen<>();
        //m2.compare(10.4,20.7);
        
        //mygen<String> m3=new mygen<>();
        //m3.compare("AMIT", "AMIT");

        mygen m=new mygen();
        m.compare(10, 20);
        m.compare(10.6, 20.7);
        m.compare("Amit","Amit");

              
    }
}