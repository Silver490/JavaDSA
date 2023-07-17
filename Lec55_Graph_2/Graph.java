package Lec55_Graph_2;

import java.util.*;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noOfEdge() {
		int ans = 0;
		for (int key : map.keySet()) {
			ans += map.get(key).size();
		}
		return ans / 2;
	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}

	}

	public void removeVertex(int v) {
		for (int nbrs : map.get(v).keySet()) {
			map.get(nbrs).remove(v);
		}
		map.remove(v);
	}

	public void Display() {
		for (int key : map.keySet()) {
			System.out.println(key + "-->" + map.get(key));
		}
	}

	public boolean hasPath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				boolean ans = hasPath(key, des, visited);
				if (ans == true) {
					return true;
				}
			}

		}
		visited.remove(src);
		return false;
	}

	public void PrintPath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + src);
			return;
		}
		visited.add(src);
		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				PrintPath(key, des, visited, ans + src);
			}

		}
		visited.remove(src);
	}

	
	public boolean BFS(int src, int des) {

		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1. remove
			int rv = q.remove();

			// 2. ignore if already visited
			if (visited.contains(rv)) {
				continue;
			}

			// 3. mark visited
			visited.add(rv);

			// 4. self work
			if (rv == des) {
				return true;
			}

			// 5. unvisited nbrs add krna

			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;

	}
	
	
	public boolean DFS(int src, int des) {
		
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		s.push(src);
		while (!s.isEmpty()) {
			// 1. remove
			int rv = s.pop();
			
			// 2. ignore if already visited
			if (visited.contains(rv)) {
				continue;
			}
			
			// 3. mark visited
			visited.add(rv);
			
			// 4. self work
			if (rv == des) {
				return true;
			}
			
			// 5. unvisited nbrs add krna
			
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}
		}
		return false;
		
	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int src: map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.remove();
				
				// 2. ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				
				// 3. mark visited
				visited.add(rv);
				
				// 4. self work
				System.out.println(rv+" ");
				
				// 5. unvisited nbrs add krna
				
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
	
	
	public void DFT() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int src: map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			s.push(src);
			while (!s.isEmpty()) {
				// 1. remove
				int rv = s.pop();
				
				// 2. ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3. mark visited
				visited.add(rv);
				// 4. self work
				System.out.println(rv+" ");
				// 5. unvisited nbrs add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
	
	
	public boolean iscycle() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		
		for(int src: map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			s.push(src);
			while (!s.isEmpty()) {
				// 1. remove
				int rv = s.pop();
				
				// 2. ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3. mark visited
				visited.add(rv);
				// 5. unvisited nbrs add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		return false;
	}
	
	
	public int CountComponents() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		int ans=0;
		for(int src: map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			ans++;
			s.push(src);
			while (!s.isEmpty()) {
				// 1. remove
				int rv = s.pop();
				
				// 2. ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3. mark visited
				visited.add(rv);
				// 5. unvisited nbrs add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		System.out.println(g.BFS(1, 7));
		System.out.println(g.DFS(1, 6));
	}

}
