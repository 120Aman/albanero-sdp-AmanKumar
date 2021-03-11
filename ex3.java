package Lambdaexpressions;

interface Show{  
    void show();  
}  
public class ex3 implements Show{  
   
    public static void main(String[] args) {  
         Show ob=()->{System.out.println("hello");};
         ob.show();
    }  
}  



