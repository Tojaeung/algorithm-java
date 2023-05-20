package 고득점kit.탐욕법.체육복;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

// https://school.programmers.co.kr/learn/courses/30/lessons/42862
// Level 1
public class test {
	@Test
	void test1() {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};

		// 기댓값
		int output = 5;

		int answer = Solution.solution(n, lost, reserve);
		assertThat(answer).isEqualTo(output);
	}

	@Test
	void test2() {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {3};

		// 기댓값
		int output = 4;

		int answer = Solution.solution(n, lost, reserve);
		assertThat(answer).isEqualTo(output);
	}

	@Test
	void test3() {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};

		// 기댓값
		int output = 2;

		int answer = Solution.solution(n, lost, reserve);
		assertThat(answer).isEqualTo(output);
	}
}
