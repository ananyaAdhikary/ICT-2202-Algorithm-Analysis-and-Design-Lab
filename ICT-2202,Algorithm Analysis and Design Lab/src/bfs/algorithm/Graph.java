package bfs.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	private int vertices;
	
	private LinkedList<Integer>[] adjacencylist;
	
	public Graph(int vertices)
	{
		this.vertices=vertices;
		this.adjacencylist=new LinkedList[vertices];
		for(int i=0;i<vertices;i++)
		{
			this.adjacencylist[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int from,int to)
	{
		adjacencylist[from].add(to);
	}
	
	
	public void BFS(int start)
	{
		boolean[] visited=new boolean[vertices];
		Queue<Integer> q=new LinkedList<>();
		
		visited[start]=true;
		q.add(start);
		
		while(!q.isEmpty())
		{
			int current=q.poll();
			System.out.print(current +" ");
			for(int neighbor:adjacencylist[current])
			{
				if(!visited[neighbor])
				{
					visited[neighbor]=true;
					q.add(neighbor);
				}
				
			}
		}
		
		
		
	}
	
	
	
}
