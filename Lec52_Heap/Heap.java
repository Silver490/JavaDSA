package Lec52_Heap;

import java.util.*;

public class Heap {
	private ArrayList<Integer> list = new ArrayList<>();

	public void add(int item) {
		list.add(item);
		upheapify(list.size() - 1);

	}

	private void upheapify(int ci) { // ci--> child index
		int pi = (ci - 1) / 2;
		if (list.get(pi) > list.get(ci)) { // child(ci) ki priority zyada h parent(pi) se
			swap(pi, ci);
			upheapify(pi);
		}
	}

	private void swap(int i, int j) {
		int ith = list.get(i);
		int jth = list.get(j);
		list.set(i, jth);
		list.set(j, ith);
	}

	public int getmin() {
		return list.get(0);
	}

	public void Display() {
		System.out.println(list);
	}

	public int remove() {
		swap(0, list.size() - 1);
		int rv = list.remove(list.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1; // left child index
		int rci = 2 * pi + 2;
		int mini=pi;
		if (lci<list.size() && list.get(mini) > list.get(lci)) { // lci ki prority zyada hai mini se
			mini=lci;
		}
		if (rci<list.size() && list.get(mini) > list.get(rci)) { // rci ki prority zyada hai mini se
			mini=rci;
		}
		if (mini!=pi) {
			swap(mini,pi);
			downheapify(mini);
		}
	}
}
