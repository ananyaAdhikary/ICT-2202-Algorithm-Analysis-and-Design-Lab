package DFS.algorithm;

public class DFSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Graph graph=new Graph(7);
		
		graph.addEdge(0,1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		
		System.out.println("The dfs traversal of the graph starting from node 0 is:");
		
		graph.DFS(0);
		
		
	}

}
