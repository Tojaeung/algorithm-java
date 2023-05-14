import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
// Level 1
class Solution2 {
	public static int[] solution(int[] arr) {
		// HashSet은 나중에 뺴낼때 순서대로 안나옴..

		// 답안의 size가 얼마나 될지 예측할 수 없기 때문에 리스트 자료구조 사용
		ArrayList<Integer> list = new ArrayList<>();

		// arr의 요소는 0 ~ 9이므로...
		int preNum = 10;
		for (int num : arr) {
			if (preNum != num)
				list.add(num);
			else
				preNum = num;
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}

		return answer;
	}
}
