package Functionalinterfaces;
interface Show{  
    void show(String msg);  
}  
public class ex2 implements Show{  
    public void show(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        ex2 ob = new ex2();  
        ob.show("Hello there");  
    }  
}  

