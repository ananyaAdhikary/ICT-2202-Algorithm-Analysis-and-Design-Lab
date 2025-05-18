package fractional.knapsack.problem;

import java.util.Comparator;

public class FKPComparator implements Comparator<FKP>{

	@Override
	public int compare(FKP o1, FKP o2) {
		// TODO Auto-generated method stub
		double cpr1=new Double(o1.getProfit()/o1.getWeight());
		double cpr2=new Double(o2.getProfit()/o2.getWeight());
		
		if(cpr1<cpr2)
			return 1;
		else 
			return -1;
	}
	

}
