
/*	
	Undirected_Graph_Using_ArrayList
	
	addEdge() takes two vertices and point them to each other
	printList() shows Adjacent vertices of i;
	
*/

import java.util.*;

public class Undirected_Graph_Using_ArrayList{

	//Method to Add Edge
	static void addEdge(ArrayList <ArrayList<Integer>> adj,
						int vertice_x,int vertice_y){ 

		adj.get(vertice_x).add(vertice_y); //from vertice X to Y
		adj.get(vertice_y).add(vertice_x); //from vertice Y to X
	}


	//Method to print Adjacent list
	static void printList(ArrayList <ArrayList<Integer>> adj){

		for (int i = 0; i < adj.size(); i++) {
			System.out.println("Vertices Adjacent to "+i);
			System.out.print("["+i+"]");
			for(int j = 0; j < adj.get(i).size(); j++){
				System.out.print("-> "+adj.get(i).get(j));
			}
			System.out.println();	
		}
			
	}	

	// main()
	public static void main(String[] args) {
		ArrayList <ArrayList<Integer>> adj = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		//Number of Vertices v
		System.out.print("Enter number of Vertices = ");
		int v;
		v = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			adj.add(new ArrayList<Integer>());
		}

		addEdge(adj,0,1);
		addEdge(adj,0,4);
		addEdge(adj,1,2);
		addEdge(adj,1,3);
		addEdge(adj,1,4);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		
		printList(adj);

	}


}