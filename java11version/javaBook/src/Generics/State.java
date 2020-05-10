package Generics;

public class State<T extends Number> {
	T[] nums;
	
	State(T[] o){
		nums=o;
	}
	
	double average() {
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue();
		return (sum/nums.length);
	}
	
	boolean sameAvg(State<?> ob) {
		if(average()==ob.average())
			return true;
		
		return false;
	}
}
