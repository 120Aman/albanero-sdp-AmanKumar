class Gen2<T extends Number>{
	T[] nums;
	Gen2(T[] o){
		nums=o;
	}
		double avg() {
			double sum=0.0;
			for(int i=0;i<nums.length;i++)
			{
				sum +=nums[i].doubleValue();
				
			}
			return sum/nums.length;
		}
		boolean same(Gen2<?> ob) {
			if(avg()==ob.avg())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
public class boundedtypes {

	public static void main(String[] args) {
		Integer inums[] = {1,2,3,4,5};
		Gen2<Integer> iob = new Gen2<Integer>(inums);
		double v=iob.avg();
		System.out.println("iob Average is:" +v);
		Float fnums[] = {1.1F,2.2F,3.3F,4.4F,5.5F};
		Gen2<Float> fob = new Gen2<Float>(fnums);
		double w=fob.avg();
		System.out.println("fob Average is:" +w);
		if(iob.same(fob))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}

}
