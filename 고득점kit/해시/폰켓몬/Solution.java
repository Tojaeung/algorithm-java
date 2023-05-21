package 고득점kit.해시.폰켓몬;

import java.util.HashSet;

// https://school.programmers.co.kr/learn/courses/30/lessons/1845
// Level 1
class Solution {
	public static int solution(int[] nums) {
		// 선택할 수 있는 폰켓몬 개수
		int pickedNum = nums.length / 2;

		// HashSet을 이용해서 편하게 중복제거
		HashSet<Integer> set = new HashSet<>();
		for (int ponketmon : nums) {
			set.add(ponketmon);
		}

		// 중복되지 않은 폰켓몬 개수
		int unDuplicatedNum = set.size();

		if (pickedNum > unDuplicatedNum) {
			return unDuplicatedNum;
		} else {
			return pickedNum;
		}
	}
}
