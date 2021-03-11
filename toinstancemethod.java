package Methodreferences;
interface Sayable1{  
    void say();  
}  
public class toinstancemethod {  
    public void say(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
    	toinstancemethod ob= new toinstancemethod(); 
            Sayable1 ob1 = ob::say;  
            ob1.say();    
            Sayable sayable2 = new toinstancemethod()::say;  
              
            sayable2.say();  
    }  
}  

