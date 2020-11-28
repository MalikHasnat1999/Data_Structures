
/* 
	Implementing Directed Graph Using Array	

	addEdge() to add edge between to vertices X and Y;
	printList() to show Adjacency List of i;

*/


public class Directed_Graph_Using_Array{

	//method to Add Edge 
	static void addEdge(int[][] matrix,int vertice_x,int vertice_y){

		matrix[vertice_x][vertice_y] = 1; // (X -> Y)

	}


	//method to print Adjaceny List
	static void printList(int[][] matrix){

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Adjacent vertices of "+i);
			System.out.print("["+i+"]");
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j] == 1){
					System.out.print("-> "+j);
				}
			}
			System.out.println();
		}
	}

	//main()
	public static void main(String[] args) {
		
		//Number of Vertices v
		int v = 5;

		int[][] matrix = new int[v][v];

		addEdge(matrix,0,1);
		addEdge(matrix,1,2);
		addEdge(matrix,1,3);
		addEdge(matrix,2,3);
		addEdge(matrix,3,4);
		addEdge(matrix,4,0);
		addEdge(matrix,4,1);

		printList(matrix);

	}
}