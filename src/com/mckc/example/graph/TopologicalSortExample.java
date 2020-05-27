package com.mckc.example.graph;

import java.util.LinkedList;

public class TopologicalSortExample {
	
	//using recursion 
	
     class Vertex{
		
		public int vertices;
		public LinkedList<Integer> adjList[];
		
		Vertex(int vertices) {
	         this.vertices = vertices;
	         adjList = new LinkedList[vertices];
	         for (int i = 0; i < vertices; i++) {
	             adjList[i] = new LinkedList<>();
	         }
	     }
		
		public void addEdge(int source, int destination) {
			
			adjList[source].addFirst(destination);
		}	

	}

	
	
	
	public static void main() {
		
		
	}

}
