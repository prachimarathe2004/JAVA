public class TypeConversion{
    public static void main(String args[])
    {
        byte b=125;
        int a=b;
        System.out.println(a);

        int c=257;
        byte k=(byte)c;
         System.out.println(k);         //257 % 256 = 1

        int d=12;
        byte e=(byte)d;
         System.out.println(e); 


         float f =5.6f;
         int t = (int)f;
         System.out.println(t); 

         byte r=10;
         byte s=30;
         int result = r*s;
         System.out.println(result);

    }
}


