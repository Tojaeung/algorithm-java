package 고득점kit.탐욕법.체육복;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42862
// Level 1
class Solution {
	public static int solution(int n, int[] lost, int[] reserve) {
		// 결론적으로, 최대한 많은 학생이 체육복을 입어야함

		// 빈 배열 만들기
		int[] students = new int[n];
		// 체육복 있는 애들 1
		Arrays.fill(students, 1);

		// 체육복 없는 애들 0
		for (int i : lost) {
			students[i - 1]--;
		}
		// 체육복 여벌있는 애들 2
		for (int i : reserve) {
			students[i - 1]++;
		}

		// 체육복 여벌이 없는 경우, 앞의 학생 여벌있는지 확인해서 처리
		for (int i = 0; i < students.length; i++) {
			if (students[i] != 0) {
				continue;
			} else {
				// 앞의 학생 여벌 없는 경우 뒤에 있는 학생 여벌있는지 확인해서 처리
				if (i > 0 && students[i - 1] == 2) {
					students[i - 1]--;
					students[i]++;
				}
				// 앞,뒤 모두 학생들 여벌 없는 경우, 다음 학생으로
				else if (i < (students.length - 1) && students[i + 1] == 2) {
					students[i + 1]--;
					students[i]++;
				}
				// 앞의 학생 여벌 없는 경우 뒤에 있는 학생 여벌있는지 확인해서 처리
				else
					continue;

			}
		}

		// 여벌 없는 학생 제외한 학생수
		int answer = n;
		for (int i : students) {
			if (i == 0) {
				answer--;
			}
		}

		return answer;
	}
}
