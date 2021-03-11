
interface Show{       
    default void show(){    
        System.out.println("Hello, this is default method");    
    }       
    void show1(String msg);      
    static void show2(String msg){    
        System.out.println(msg);    
    }    
}    
public class ex1 implements Show{    
    public void show1(String msg){    
        System.out.println(msg);    
    }    
    public static void main(String[] args) {    
        ex1 dm = new ex1();    
        dm.show();                       
        dm.show1("Work is worship");          
        Show.show2("Helloooo...");     
    }    
}    

