package lambda;

public class HighTemp {
	private int hTemp;
	
	HighTemp(int ht){hTemp=ht;}
	
	boolean sameTemp(HighTemp ht2) {
		return hTemp==ht2.hTemp;
	}
	
	boolean lessThenTemp(HighTemp ht2) {
		return hTemp<ht2.hTemp;
	}
}
