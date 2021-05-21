package com.khelkar.sunil.graph;

import java.util.ArrayList;

import com.khelkar.sunil.graph.Graph.Edge;

public class GetConnectedComponents {
	
	public static void main(String[] args) {
		 ArrayList<Edge>[] graph = Graph.graph;
		 
		 ArrayList<ArrayList<Integer>> components = new ArrayList<>();
		 
		 boolean[] visted = new boolean[graph.length];
		 for (int i=0; i < graph.length; i++) {
			 if (visted[i] == false) {
				 ArrayList<Integer> comp = new ArrayList<>();
				 components.add(comp);
				 getComponentsFrom(graph, i, visted, comp);
			 }
		 }
		 
		 System.out.println(components);
		 
	}

	private static void getComponentsFrom(ArrayList<Edge>[] graph, int src, boolean[] visted, ArrayList<Integer> comp) {
		comp.add(src);
		visted[src] = true;
		
		for (Edge nbr : graph[src]) {
			if (visted[nbr.nbr] == false) {
				getComponentsFrom(graph, nbr.nbr, visted, comp);
			}
		}
	}
}
