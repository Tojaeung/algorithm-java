package 고득점kit.스택큐.같은숫자는싫어;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
// Level 1
class Solution {
	public static int[] solution(int[] arr) {
		// HashSet은 나중에 뺴낼때 순서대로 안나옴..

		// 답안의 size가 얼마나 될지 예측할 수 없기 때문에 리스트 자료구조 사용
		ArrayList<Integer> list = new ArrayList<>();

		list.add(arr[0]);
		for (int i = 0; i < (arr.length - 1); i++) {
			if (arr[i] != arr[i + 1])
				list.add(arr[i + 1]);
			else
				continue;
		}

		// 리스트를 배열로 변경
		// int[] result = list.stream().mapToInt(x -> x).toArray();

		// parseInt와 intValue의 차이 참고: https://java119.tistory.com/30
		// parseInt는 String -> int
		// intValue는 Integer -> int
		int[] result = list.stream().mapToInt(Integer::intValue).toArray();
		return result;
	}
}
