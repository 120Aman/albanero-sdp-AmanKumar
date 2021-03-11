package exceptions;
import java.util.Scanner;
class InvalidAgeException extends Exception{  
	String A;
	InvalidAgeException(String s){  
		 A=s;
	 }  
	}  
	
public class Myexception {

	   static void validate(int age)throws InvalidAgeException{  
		     if(age<18)  
		      throw new InvalidAgeException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
		   }  
		     
		   public static void main(String args[]){  
		     int b;
		     Scanner ob=new Scanner(System.in);
		     b=ob.nextInt();
			   try{  
		      validate(b);  
		      }catch(Exception n){
		    System.out.println("Exception occured: "+n);
		    }  
		  }  
		}  

