package com.mckc.example.graph;

import java.util.Stack;

public class DFSTraversal {
	
	class Vertex {
		
		public char label;
		public boolean visited;
		public Vertex(char lab) {
			this.label=lab;
			this.visited= false;
		}
		
	}
	
	private int maxVertices=20;
	private Vertex vertexList[];
	private int adjMatrix[][];
	private int vertexCount;
	private Stack<Integer> theStack;
	
	public DFSTraversal() {
		
		vertexList = new Vertex[maxVertices];
		adjMatrix = new int[maxVertices][maxVertices];
		vertexCount=0;
		for(int y=0;y<maxVertices;y++) {
			for(int x=0;x<maxVertices;x++) {
				adjMatrix[x][y]=0;
				theStack= new Stack();
			}
			
		}
	}
	public void addVertex(char lab) {
		vertexList[vertexCount++]=new Vertex(lab);
	}
	
	public void addEdge(int start, int end) {
		
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;
	}
	
	public void displayVertex(int v) {
		System.out.println(vertexList[v].label);
		
	}
	
	public void dfs() {
		
		vertexList[0].visited=true;
		displayVertex(0);
		
		theStack.push(0);
		
		while(!theStack.isEmpty()) {
			
			int v = getAdjUnvisitedMatrix(theStack.peek());
			
			if(v==-1) {
				theStack.pop();
				
			}else {
				vertexList[v].visited=true;
				displayVertex(v);
				theStack.push(v);
			}
		
		}
		for(int j=0;j<vertexCount;j++) {
			vertexList[j].visited=false;
		}
	}
	
	public int getAdjUnvisitedMatrix(int v) {
		for(int j=0;j<vertexCount;j++) {
			if(adjMatrix[v][j]==1 && vertexList[j].visited==false)
				return j;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		
		DFSTraversal dfs = new DFSTraversal();
		
		dfs.addEdge(0, 1);
		
		dfs.addVertex('A');
		
		dfs.dfs();
	}

}
