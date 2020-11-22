

/*
	
	Implementing BFS Using ArrayList

	"Directed Graph"

	class Graph{}
	addEdge() used to add Edge between Two Vertices
	BFS() That ChecksIf every Node is Visited
	
*/


import java.util.ArrayList;
import java.util.Iterator;

class Graph{

	ArrayList <ArrayList<Integer>> adj = new ArrayList<>();

	// contain Nodes {0,1,2,3,4}
	// is Always Declared as False
	// it will be marked True if Node is Visited
	// else will Remain False
	boolean[] visited ;

	// Array that store the Node whose
	// Adjacency List has been Visited. 
	int[] arr;

	// number of vertices
	int v;

	// Constructor
	Graph(int v){

		this.v = v;

		// Makes Adjacency List of every i.
		for (int i=0; i<v; i++) {
			adj.add(new ArrayList<>());
		}

		// Initializing the boolean Array
		visited = new boolean[v];

		// We cannot Initialize an
		// array as Null so -1.
		arr = new int[v];
		for (int i=0; i<v; i++) {
			arr[i] = -1;
		}

	}	
 
	// method to add Edge
	void addEdge(int vertice_x,int vertice_y){

		adj.get(vertice_x).add(vertice_y);  // From X -> Y
	} 

	// Method of BFS
	void BFS(int s){
		
		if(!visited[s]){
			visited[s] = true;
			System.out.print(s + " ");
		}
		
		// Iterator it_1 is used to Traverse through 
		// the Adjacency List of s.
		// adj.get(s).iterator() meaning it starts 
		// from ArrayList index s.
		Iterator<Integer> it_1 = adj.get(s).iterator();

		// Array that store the Node whose
		// Adjacency List has been Visited 
		arr[s] = s;
		
		// Marking Adjacency List of s as Visited
		while(it_1.hasNext()){

			int num = it_1.next();
			if(!visited[num]){
				visited[num] = true;
				System.out.print(num + " ");
			}
		}

		// Iterator it_2 is used to Traverse through 
		// the Adjacency List of s.
		Iterator<Integer> it_2 = adj.get(s).iterator();

		// Traversing through the Adjacency List of s.
		// one by one.
		while (it_2.hasNext()){

			int n = it_2.next();
			if (arr[n] != n){
				BFS(n);	

			}	
		}

	}// End Method BFS()


	// method to Print Adjacency list
	void printList(){

		for (int i = 0; i < v; i++) {

			System.out.println("Adjacency List of Vertice "+i);
			System.out.print("["+i+"]");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print("-> "+adj.get(i).get(j));	
			}
			System.out.println();
		}
	}


}// End class Graph

public class BFS_Using_ArrayList{

	public static void main(String[] args) {
			
		Graph g = new Graph(6);

		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(4,0);
		g.addEdge(4,1);
		g.addEdge(4,5);

		g.printList();

		System.out.print("BFS Traversal = ");
		// Starting Node is 2
		g.BFS(2);
	}
}