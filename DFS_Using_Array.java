
/*

	Implementing DFS Using Array

	"Directed Graph"

	class Graph{}
	addEdge() used to add Edge between Two Vertices
	DFS() That Checkes If every Node is Visited
	DFS_Traversal() checks [0++][0,1,2,3,4] == 1 and 2nd[] is visitd


*/


class Graph{

	int[][] matrix;
	//Number of vertices
	int v;

	//Constructor
	Graph(int v){
		this.v = v;
		matrix = new int[v][v];
	}

	//method to Add Edge between Two Vertices
	void addEdge(int vertice_x,int vertice_y){

		matrix[vertice_x][vertice_y] = 1;

	}

	// method to print Adjaceny Matrix
	void printMatrix(){

		for (int i = 0; i < v; i++) {
			System.out.println("Adjacent List of Vertice "+i);
			System.out.print("["+i+"]");
			for (int j = 0; j < v; j++) {
				if(matrix[i][j] == 1){
					System.out.print("-> "+j);
				}
			}
			System.out.println();
		}
		
	}

	// method of DFS
	void DFS(){

		// contain Nodes {0,1,2,3,4}
		// is Always Declared as False
		// it will be marked True if Node is Visited
		// elss will Remain False
		boolean[] visited = new boolean[v];

		for(int i = 0; i < v; i++){

			// if Node is Not Visited (! = not)
			if(!visited[i]){ 
				System.out.print("\nDFS Traversal = ");
				DFS_Traversl(i,visited);
			}
		}
		System.out.println();
	}

	//method of DFS Traversal
	void DFS_Traversl(int i,boolean[] visited){

		visited[i] = true;
		System.out.print(i+" ");

		// Find matrix[0][0,1,2,3,4] == 1 thorugh loop
		// then checks if that element is Visited
		for(int a = 0; a < v; a++){
			if(matrix[i][a] == 1){
				if(!visited[a]){
					DFS_Traversl(a,visited);
				}
			}

		}
	}

}// End Class Graph


// main() File
public class DFS_Using_Array{

	public static void main(String[] args) {
		Graph g = new Graph(5);

		g.addEdge(0,3);
		g.addEdge(3,4);
		g.addEdge(4,2);
		g.addEdge(2,1);
		g.addEdge(1,0);
		g.addEdge(1,4);

		g.printMatrix();

		g.DFS();

	}
}