interface X{  
void print();  
}  
interface Y{  
void show();  
}  
class W implements X,Y{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
}

public class Multipleinheritance {
public static void main(String args[]){  
		W obj = new W();  
		obj.print();  
		obj.show();  
		 }  

}
