public class myproblem {
    public static void main(String[] args) {
        int []a={10,12,34,1,4,5,6};//Array Declareation and initilization

       try{
		System.out.println(a[1]);
        System.out.println(a[4]);
        System.out.println(a[2]);
        System.out.println(a[5]);
        System.out.println(a[8]);//Exception// treminated immidiately
        System.out.println(a[0]);
        System.out.println(a[5]);
	   }catch(NumberFormatException e)
	   {
		System.out.println("you are Accessing Array Element from invalid range");
	   }
	   catch(NegativeArraySizeException e)
	   {
		System.out.println("you are Accessing Array Element from invalid range");
	   }
	   catch(NullPointerException e)
	   {
		System.out.println("you are Accessing Array Element from invalid range");
	   }
	   catch(Exception e)
	   {
		System.out.println("All handled Here");
	   }

    }
    
}
