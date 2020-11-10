/*
	Implementing Undirected Graph Using Array

	addEdge() to add edge between to Vertices (X <--> Y);
	printList() to shows Adjacent vertices of i;

*/


import java.util.*;

public class Undirected_Graph_Using_Array{

	//method to addEdge()
	static void addEdge(int[][] matrix,int vertice_x,int vertice_y){

		matrix[vertice_x][vertice_y] = 1; // (X -> Y)
		matrix[vertice_y][vertice_x] = 1; // (Y -> X)

	}

	// method to print Adjaceny List
	static void printList(int[][] matrix){

		for (int i=0; i < matrix.length; i++) {

			System.out.println("Adjacent vertices of "+i);
			System.out.print("["+i+"]");
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 1) {
					System.out.print("-> "+j);
				}
			}
			System.out.println();
		}

	} 

	// main()
	public static void main(String[] args) {

		//number of vertices
		int v = 5;

		int[][] matrix = new int[v][v];
		
		System.out.print("matrix length = "+matrix.length);

		addEdge(matrix,0,1);
		addEdge(matrix,0,4);
		addEdge(matrix,1,2);
		addEdge(matrix,1,3);
		addEdge(matrix,1,4);
		addEdge(matrix,2,3);
		addEdge(matrix,3,4);
		
		printList(matrix);

	}

} 