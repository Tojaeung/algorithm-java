package 고득점kit.힙.더맵게;

import java.util.PriorityQueue;

// https://school.programmers.co.kr/learn/courses/30/lessons/42626?language=java
// Level 2
class Solution {
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int num : scoville) {
			pq.add(num);
		}

		int answer = 0;
		while (pq.peek() < K) {
			// 모든 음식을 섞어도 K를 넘지 못한다면 -1 반환
			if (pq.size() == 1) {
				answer -= 1;
				break;
			}

			int firstFood = pq.poll();
			int secondFood = pq.poll();

			int mixedFood = firstFood + (secondFood * 2);
			pq.add(mixedFood);
			answer += 1;
		}

		return answer;
	}
}
