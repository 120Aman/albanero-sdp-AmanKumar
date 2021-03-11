package listinterface;
import java.util.*; 

public class Arraylist {

	public static void main(String[] args) {
		 
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);  
		list1.add(3);  
		list1.add(687);  
		Iterator itr1=list1.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		}  
	}

