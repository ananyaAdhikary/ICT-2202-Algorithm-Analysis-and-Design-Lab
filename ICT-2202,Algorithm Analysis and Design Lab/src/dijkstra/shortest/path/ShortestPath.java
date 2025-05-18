package dijkstra.shortest.path;
public class ShortestPath {
	static final int V=9;
	int minDistance(int dist[],Boolean visited[])
	{
		int min=Integer.MAX_VALUE;
		int min_index=-1;
		for(int i=0;i<V;i++)
		{
			if(!visited[i] && dist[i]<=min)
			{
				min=dist[i];
				min_index=i;
			}
		}
		return min_index;
	}
	void printFunction(int dist[])
	{
		System.out.println("\tvertex \t\t distance from Source");
		for(int i=0;i<V;i++)
		 System.out.println("\t  "+i+ "\t\t\t" +dist[i]);
	}
	void dijkstra(int graph[][],int src) {
		int dist[]=new int[V];
		Boolean visited[]=new Boolean[V];
		for(int i=0;i<V;i++)
		{
			dist[i]=Integer.MAX_VALUE;
			visited[i]=false;
		}
		dist[src]=0;
		for(int count=0;count<V-1;count++)
		{
			int u=minDistance(dist,visited);
			visited[u]=true;
			
			for(int v=0;v<V;v++)
			{
				if(!visited[v]&& graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v])
					dist[v]=dist[u]+graph[u][v];
			}
		}
		printFunction(dist);
	}
}
