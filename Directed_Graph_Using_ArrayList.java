
/*
	Impelmenting Directed_Graph_Using_ArrayList

	addEdge() takes two verticecs and point x to y (X -> Y)
	printList() shows Adjacent vertices of i;
*/


import java.util.*;

public class Directed_Graph_Using_ArrayList{

	//Method to Add Edge
	static void addEdge(ArrayList <ArrayList<Integer>> adj,
						int vertice_x,int vertice_y){

		adj.get(vertice_x).add(vertice_y);// from vertice X to Y (X -> Y)
	}

	//Method to show Adjacency List
	static void printList(ArrayList <ArrayList<Integer>> adj){

		for(int i = 0; i < adj.size(); i++){

			System.out.println("Vertices Adjacent to "+i);
			System.out.print("["+i+"]" );
			for(int j = 0; j < adj.get(i).size(); j++){
				System.out.print(" ->"+adj.get(i).get(j));
			}
			System.out.println();
		}

	}

	//main()
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <ArrayList<Integer>> adj = new ArrayList<>();

		//Number of Vertices v
		System.out.print("Enter number of Vertices = ");
		int v;
		v = sc.nextInt();

		for (int i = 0; i < v; i++) {
			adj.add(new ArrayList<>());
		}

		addEdge(adj,0,1);
		addEdge(adj,1,2);
		addEdge(adj,1,3);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		addEdge(adj,4,0);
		addEdge(adj,4,1);

		printList(adj);

	}
}