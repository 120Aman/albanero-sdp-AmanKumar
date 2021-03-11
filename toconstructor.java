package Methodreferences;
interface V{  
    void w(String msg); 
}  
class A{  
    A(String msg){  
        System.out.print(msg);  
    }  
}  
public class toconstructor {  
    public static void main(String[] args) {  
        V hello = A::new;  
        hello.w("Hello");  
    }  
}  

