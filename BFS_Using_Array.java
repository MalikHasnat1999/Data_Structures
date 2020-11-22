

/*

	Impementing BFS_Using_Array

	"Directed Graph"

	class Graph{}
	addEdge() used to add Edge between Two Vertices
	BFS() That Checkes If every Node is Visited
	
*/


class Graph{

	// Adjacency Matrix
	int[][] matrix;

	// number of Vertices
	int v;

	// contain Nodes {0,1,2,3,4}
	// is Always Declared as False
	// it will be marked True if Node is Visited
	// else will Remain False
	boolean[] visited;

	// Array that keeps Track of Node whoose
	// Adjacency List has been Marked Visited.
	int[] arr;

	// Constructor
	Graph(int v){
		this.v = v;
		matrix = new int[v][v];
		visited = new boolean[v];
		arr = new int[v];
	}

	// Method to Add Edge
	void addEdge(int vertice_x,int vertice_y){

		matrix[vertice_x][vertice_y] = 1; //(X -> Y)	
	}

	// Method to Print Adjacency Marix
	void printMatrix(){

		for (int i = 0; i < v; i++) {

			System.out.println("Adjacency List of Vertice "+i);
			System.out.print("["+i+"]");
			for (int j = 0; j < v; j++) {	
				if(matrix[i][j] == 1){
					System.out.print("-> "+j);
				}
			}
			System.out.println();
		}

	}

	//Method of BFS
	void BFS(int s){

		// Mark the current Node as Visited
		if (!visited[s]) {
			visited[s] = true;
			System.out.print(s + " ");
		}


		// Mark the Adjacency List of s as Visited
		for (int i = 0; i < v; i++) {
			if(matrix[s][i] == 1){
				if(!visited[i]){
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
		arr[s] = s;


		// Taking Adjacency List Node one by one
		// travering them.
		for (int j = 0; j < v; j++) {
				
			if(matrix[s][j] == 1){
				if(arr[j] != j){
					BFS(j);
				}
			}
		}	

	}// End Method BFS()

}// End class Graph

public class BFS_Using_Array{
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

		g.printMatrix();

		System.out.print("BFS Traversal = ");

		// Starting Node is 2
		g.BFS(2);
	}
}