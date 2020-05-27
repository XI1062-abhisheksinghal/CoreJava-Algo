package com.mckc.example.graph;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BFSTraversal {
	
	class Vertex {
		public char label;
		public boolean visited;
        
		public Vertex(char lab) {
			this.label=lab;
			visited = false;
		}
		
		
	}
	private final int maxVerticesCount =20;
	private Queue<Integer> queue;
	private Vertex vertexList[];
	
	private int adjMatrix[][];
	private int vertexCount;
	
	public BFSTraversal() {
		
		vertexList = new Vertex[maxVerticesCount];
		adjMatrix = new int[maxVerticesCount][maxVerticesCount];
		for(int i=0;i<maxVerticesCount;i++) {
			for(int j=0;j<maxVerticesCount;j++) {
				adjMatrix[i][j]=0;
			}
		}
		
		queue = new ArrayBlockingQueue<Integer>(maxVerticesCount);
	}
	
	public void addEdge(int source , int dest) {
		adjMatrix[source][dest]=1;
		adjMatrix[dest][source]=1;
	}
	
	public void displayVertex(int v) {
		System.out.println(vertexList[v].label);
	}
	
	public void addVertex(char lab) {
		vertexList[vertexCount++] =new Vertex(lab);
	}
	
	
	public void bfs() {
		
		vertexList[0].visited=true;
		displayVertex(0);
		queue.add(0);
		int v2 ;
		
		while(!queue.isEmpty()) {
			int v1 =queue.remove();
			while((v2=getAdjUnvisitedVertex(v1))!=-1){
				vertexList[v2].visited=true;
				displayVertex(v2);
				queue.add(v2);
			}
		}
		
		for(int j=0;j<vertexCount;j++)
			vertexList[j].visited=false;
	}
	
	public int getAdjUnvisitedVertex(int v) {
		for(int j=0;j<vertexCount;j++) {
			if(adjMatrix[v][j]==1 && vertexList[j].visited==false) 
				return j;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		
		BFSTraversal bfsTraversal = new BFSTraversal();
		
		bfsTraversal.addVertex('A');
		bfsTraversal.addVertex('B');
		bfsTraversal.addVertex('C');
		bfsTraversal.addVertex('D');
		bfsTraversal.addVertex('E');
		bfsTraversal.addVertex('F');
		bfsTraversal.addVertex('G');
		
		bfsTraversal.addEdge(0, 1);
		bfsTraversal.addEdge(0, 2);
		bfsTraversal.addEdge(1, 3);
		bfsTraversal.addEdge(1, 4);
		
		bfsTraversal.addEdge(5, 3);
		bfsTraversal.addEdge(5, 6);
		
		bfsTraversal.bfs();
		
	}
}
