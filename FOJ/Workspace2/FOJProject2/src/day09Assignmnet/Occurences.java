package day09Assignmnet;

import java.util.*;

public class Occurences {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 1, 4, 5, 2, 5, 6, 3 };
		// ArrayList<Integerteger> a = new ArrayList();
		// for(int i = 0; i < arr.length; i++){
		// a.add(arr[i]);
		// }

		HashMap<Integer, Integer> h = new HashMap();

		// cunting occurences

		for (int i = 0; i < arr.length; i++) {
			if (h.containsKey(arr[i])) {
				int val = h.get(arr[i]);
				h.put(arr[i], val + 1);
			} else {
				h.put(arr[i], 1);
			}

		}

		for (Map.Entry<Integer, Integer> e : h.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}

}
