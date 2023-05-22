package 고득점kit.해시.의상;

import java.util.HashMap;
import java.util.Iterator;

// https://school.programmers.co.kr/learn/courses/30/lessons/42578
// Level 2
class Solution {
	public static int solution(String[][] clothes) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (String[] cloth : clothes) {
			String type = cloth[1];
			hm.put(type, hm.getOrDefault(type, 0) + 1);
		}

		int answer = 1;
		Iterator<Integer> it = hm.values().iterator();
		while (it.hasNext()) {
			answer *= it.next().intValue() + 1;
		}

		return answer - 1;
	}
}
