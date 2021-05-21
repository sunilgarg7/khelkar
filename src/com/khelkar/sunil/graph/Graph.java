package com.khelkar.sunil.graph;

import java.util.ArrayList;

public class Graph {
	
	static {
		Graph.main(new String[0]);
	}

	public static ArrayList<Edge>[] graph;
	
	static class Edge {
		int src;
		int nbr;
		int weight;
		
		public Edge(int src, int nbr, int weight) {
			this.src = src;
			this.nbr = nbr;
			this.weight = weight;
		}

		public Edge(int src, int nbr) {
			this.src = src;
			this.nbr = nbr;
		}
		
		@Override
		public String toString() {
			return "Edge [src=" + src + ", nbr=" + nbr + ", weight=" + weight + "]";
		}
	}


	public static void main(String[] args) {
		int vtcs = 7; // we could take this from user
		graph = new ArrayList[vtcs]; // Our graph
		
		for (int i=0; i<vtcs; i++) {
			graph[i] = new ArrayList<>();
		}
		
	//	// now we can iterate over each input and fill the graph
	//	int input = 100; // we have 100 edges
	//	int edgeSrc = 0 , edgeNbr= 0, edgeWeigh= 0;
	//	for (int i = 0;  i < input; i++ ) {
	//		graph[edgeSrc].add(new Edge(edgeSrc, edgeNbr, edgeWeigh));
	//	}
		
		graph[0].add(new Edge(0, 3, 40));
		graph[0].add(new Edge(0, 1, 10));
		
		graph[1].add(new Edge(1, 0, 10));
		graph[1].add(new Edge(1, 2, 10));
		
		graph[2].add(new Edge(2, 3, 10));
		graph[2].add(new Edge(2, 1, 10));

		graph[3].add(new Edge(3, 0, 40));
		graph[3].add(new Edge(3, 2, 10));
		graph[3].add(new Edge(3, 4, 2));

		graph[4].add(new Edge(4, 3, 2));
		graph[4].add(new Edge(4, 5, 3));
		graph[4].add(new Edge(4, 6, 3));

		graph[5].add(new Edge(5, 4, 3));
		graph[5].add(new Edge(5, 6, 3));
		
		graph[6].add(new Edge(6, 5, 3));
		graph[6].add(new Edge(6, 4, 8));

		System.out.println();
		for (ArrayList vertex : graph) {
			System.out.println(vertex);
		}
		System.out.println();
	}
	
}
