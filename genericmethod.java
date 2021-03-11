
public class genericmethod {
static<T extends Comparable<T>,V extends T>boolean isIn(T x,V[] y){
	for(int i=0;i<y.length;i++)
		if(x.equals(y[i]))return true;
		return false;	
}
	public static void main(String[] args) {
		Integer nums[]= {1,2,3,4,5};
		if(isIn(2,nums))
		{
			System.out.println("present");
		}
		if(!(isIn(7,nums)))
		{
			System.out.println("not present");
		}
		String strums[]= {"A","B","C","D","E"};
		if(isIn("A",strums))
		{
			System.out.println("present");
		}
		if(!(isIn("F",strums)))
		{
			System.out.println("not present");
		}
			

	}

}
