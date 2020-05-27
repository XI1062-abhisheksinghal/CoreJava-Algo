package com.mckc.example.graph;

public class DFSGraph {
	
	class vertex{
		int label ;
		
		vertex(int label){
			this.label= label;
		}
	}
	
	class Edge{
		
		int weight;
		int src;
		int dest;
		
		Edge(int weight, int src, int dest){
			this.weight=weight;
			this.src= src;
			this.dest= dest;
			
		}
	}
	
	public void addEdge(int src,int dest,int weight) {
		
		Edge e = new Edge(weight, src, dest);
	}
	
	
	
	public static void main(String args[]) {
		
		//      9     10
		/*** 1-----3-----5
		|     |
	  8	|     | 11
		7-----4
		   12
		****/
		
		
	}
	
	

}
