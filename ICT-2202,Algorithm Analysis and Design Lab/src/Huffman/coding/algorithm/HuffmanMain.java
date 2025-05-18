package Huffman.coding.algorithm;

import java.util.PriorityQueue;

public class HuffmanMain {
	public static int count=0;
	
	static void printcode(HuffmanNode root,String s)
	{
		if(root.left==null && root.right==null && Character.isLetter(root.c))
		{
			System.out.println(root.c+":"+s);
			count+=(s.length()*root.freq);
			return;
		}
		printcode(root.left,s+"0");
		printcode(root.right,s+"1");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		int[] freqArr= {100,53,133,60,44,8};
		char[] charArr= {'A','C','E','M','U','Z'};
		
		PriorityQueue<HuffmanNode>q=new PriorityQueue<HuffmanNode>(n,new HuffmanComparator());
		
		for(int i=0;i<n;i++)
		{
			HuffmanNode hn=new HuffmanNode();
			hn.c=charArr[i];
			hn.freq=freqArr[i];
			hn.left=null;
			hn.right=null;
			q.add(hn);
		}
		HuffmanNode root=null;
		
		while(q.size()>1)
		{
			HuffmanNode x=q.peek();
			q.poll();
			
			HuffmanNode y=q.peek();
			q.poll();
			
			HuffmanNode p=new HuffmanNode();
			p.freq=x.freq+y.freq;
			p.c='_';
			p.left=x;
			p.right=y;
			root=p;
			q.add(p);
		}
	
		printcode(root,"");
		int asciiLength=root.freq*8;
		
		System.out.println("Ascii length of the characters is:"+asciiLength);
		System.out.println("compression length:"+count);
		System.out.println("the compression percentage="+((double)(asciiLength-count)*100/asciiLength)+"%");
		
	}

}
