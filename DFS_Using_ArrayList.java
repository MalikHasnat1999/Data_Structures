

/*

	Implementing DFS Using ArrayList

	"Directed Graph"

	class Graph{}
	addEdge() used to add Edge between Two Vertices
	DFS() That Checks If every Node is Visited
	DFS_Traversal() checks if < ArrayList<> > is visited
	

*/



import java.util.*;

class Graph{

	ArrayList <ArrayList<Integer>> adj = new ArrayList<>();
	// number of Vertices
	int v;	

	//constructor
	Graph(int v){
		this.v = v;
		for (int i = 0; i < v; i++) {
			adj.add(new ArrayList<>());
		}
	}

	//method to add Edge
	void addEdge(int vertice_x,int vertice_y){

		adj.get(vertice_x).add(vertice_y); // (X -> Y)
	}


	//method of DFS
	void DFS(){

		// contain Nodes {0,1,2,3,4}
		// is Always Declared as False
		// it will be marked True if Node is Visited
		// eles will Remain False
		boolean[] visited = new boolean[v];

		System.out.print("\nDFS Traversal = ");
		for (int i = 0; i < v; i++) {

			// if Node is Not Visited (! == not)
			if(visited[i] == false){
				DFS_traversal(i,visited);
			}
		}
		System.out.println();
	}

	//method of DFS Traversal
	void DFS_traversal( i,boolean[] visited){
int
		// marked i as Visited
		visited[i] = true;
		System.out.print(i+" ");

		// Iterator is used to Traverse through the
		// Adjacency List of ArrayList.
		// adj.get(i).iterator() meaning it starts
		// from ArrayList index i
		Iterator <Integer> it = adj.get(i).iterator();
		
		while(it.hasNext()){
			
			int n = it.next();		
			if(!visited[n]){
				DFS_traversal(n,visited);
			}
		}
	}

	//method to Print Adjacent List
	void printList(){

		for (int i = 0; i < v; i++) {

			System.out.println("Vertices Adjacent to "+i);
			System.out.print("["+i+"]");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print("-> "+adj.get(i).get(j));
			}
			System.out.println();
		}
	}


}// end Class Graph

public class DFS_Using_ArrayList{
	public static void main(String[] args) {
		Graph g = new Graph(4);

		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);

		g.printList();

		g.DFS();

	}
}