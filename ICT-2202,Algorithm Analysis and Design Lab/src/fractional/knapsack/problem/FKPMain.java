package fractional.knapsack.problem;

import java.util.ArrayList;
import java.util.Collections;

public class FKPMain {
	public static void calculation(ArrayList<FKP> list)
	{
		int capacity=15;
    	double totalProfit=0;
		for(int i=0;i<list.size();i++)
		{
			if(capacity==0)
				break;
			else if(capacity>=list.get(i).getWeight())
			{
				totalProfit=totalProfit+list.get(i).getProfit();
				capacity=capacity-list.get(i).getWeight();
			}
			else {
				double t=((double)list.get(i).getProfit() / (double)list.get(i).getWeight());
				totalProfit=totalProfit+(t*capacity);
				capacity=0;
			}
		}
		System.out.println("totalProfit:"+totalProfit);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<FKP> list=new ArrayList<FKP>();
		
		FKP i1=new FKP();
		i1.setObject(1);
		i1.setProfit(12);
		i1.setWeight(3);
		
		FKP i2=new FKP();
		i2.setObject(2);
		i2.setProfit(5);
		i2.setWeight(1);
		
		FKP i3=new FKP();
		i3.setObject(3);
		i3.setProfit(16);
		i3.setWeight(4);
		
		FKP i4=new FKP();
		i4.setObject(4);
		i4.setProfit(7);
		i4.setWeight(2);
		
		FKP i5=new FKP();
		i5.setObject(5);
		i5.setProfit(9);
		i5.setWeight(9);
		
		FKP i6=new FKP();
		i6.setObject(6);
		i6.setProfit(11);
		i6.setWeight(4);
		
		FKP i7=new FKP();
		i7.setObject(7);
		i7.setProfit(6);
		i7.setWeight(3);
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		list.add(i6);
		list.add(i7);
		
		Collections.sort(list,new FKPComparator());
		
		
		
         calculation(list);
	}

}
