package Lec55_Graph_2;

import java.util.*;

public class Graph_Valid_Tree {
	public static void main(String[] args) {
		int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 1, 3 }, { 1, 4 } };
		int n=5;
		System.out.println(validTree(n, edges));
		
	}
	
	public static boolean validTree(int n, int [][] edges)  {
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
		
		for(int i=0; i<n;i++) {
			map.put(i, new HashMap<>());
		}
		for (int i = 0; i < edges.length; i++) {
			int a1=edges[i][0];
			int b1=edges[i][1];
			map.get(a1).put(b1, 2);
			map.get(b1).put(b1, 2);
		}
		return isValidtree(map);
	}

	public static boolean isValidtree(HashMap<Integer, HashMap<Integer, Integer>> map) {
		// TODO Auto-generated method stub
		
		
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int ans=0;
		for(int src: map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			ans++;
			q.add(src);
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.remove();
				
				// 2. ignore if already visited
				if (visited.contains(rv)) {
					return false;
				}
				
				// 3. mark visited
				visited.add(rv);
				
				
				// 5. unvisited nbrs add krna
				
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return ans==1;
	}
	
	

}
