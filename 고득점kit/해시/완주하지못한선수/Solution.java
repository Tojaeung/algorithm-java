package 고득점kit.해시.완주하지못한선수;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
// Level 1
class Solution {
	public static String solution(String[] participant, String[] completion) {

		// 해쉬맵을 이용해서 참가자를 정리한다.
		HashMap<String, Integer> hm = new HashMap<>();
		for (String runner : participant) {
			hm.put(runner, hm.getOrDefault(runner, 0) + 1);
		}

		// 완주자들을 확인해서 해쉬맵의 Value값을 하나씩 빼준다.
		for (String completedRunner : completion) {
			hm.put(completedRunner, hm.get(completedRunner) - 1);
		}

		// 최종적으로 남은 참가자를 리턴한다.
		String result = "";
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				result = key;
				break; // 완주하지못한 선수 찾는 동시에 반복문을 종료해서 쓸데없는 일하는것을 막음..
			}
		}

		return result;
	}
}
