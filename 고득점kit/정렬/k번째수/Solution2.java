package 고득점kit.정렬.k번째수;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748
// Level 1
class Solution2 {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		int a = 0; // for문 안쓴것을 이걸로 대체
		for (int[] info : commands) {
			int i = info[0];
			int j = info[1];
			int k = info[2];

			int[] buf = Arrays.copyOfRange(array, i - 1, j);
			Arrays.sort(buf);
			answer[a] = buf[k - 1];
			a++; // for문 안쓴것을 이걸로 대체
		}

		return answer;
	}
}
