package 고득점kit.정렬.k번째수;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748
// Level 1
class Solution {
	public static int[] solution(int[] array, int[][] commands) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int[] command : commands) {
			int[] tempArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
			Arrays.sort(tempArray);
			list.add(tempArray[command[2] - 1]);
		}

		// 리스트를 배열로 변경해서 반환
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
}
