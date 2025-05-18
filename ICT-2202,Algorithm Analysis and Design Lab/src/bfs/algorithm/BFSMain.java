package bfs.algorithm;

public class BFSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g=new Graph(7);
		
		g.addEdge(0,1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 5);
		g.addEdge(2, 6);
		
		System.out.println("The bfs traversal of the graph starting from node 0 is:");
		
		g.BFS(0);
		

	}

}
