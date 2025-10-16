class calculator{
    int a;

    public static int add(int n1, int n2){
       int r= n1 +n2;
         return r;
    }
}



public class Main4 {
    public static void main(String[] args) {
        int num1=3;
        int num2=6;
        calculator calc=new calculator() ;
        int result=calc.add(num1,num2);
       
        System.out.println(result);
    }
    
}
