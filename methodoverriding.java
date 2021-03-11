class dim{
	double a, b;
	dim(double x,double y){
		a=x;
		b=y;
	}
	double area() {
		System.out.println("area undefined");
		return 0;
	}
}
class Rectangle extends dim{
	Rectangle(double u, double v){
		super(u,v);
	}
	double area() {
		System.out.println("area of rectangle");
		return a*b;
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		Rectangle r =new Rectangle(6,7);
		dim d =new dim(5,7);
		System.out.println(r.area());
		System.out.println(d.area());
	}

}
