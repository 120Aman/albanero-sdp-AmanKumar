
interface Sayable{  
    void say();  
}  
public class tostaticmethod  {  
    public static void say(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        Sayable ob = tostaticmethod ::say; 
        ob.say();  
    }  
}  

