public class myoperations {
    public static void main(String []s)
    {
        String s1="ITM ";
        System.out.println("the length of Given String is="+s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
       // System.out.println(s1.charAt(15));
        System.out.println(s1.indexOf("Pradesh"));
       // System.out.println(s1.lastIndexOf("Pradesh"));
       System.out.println(s1.trim());//Streaming Cleaning

       String s2="Pradesh";
       String s3=s1.concat(s2);
       System.out.println(s3);
       System.out.println("After Concatination");
       System.out.println(s3.length());
    
}
}
