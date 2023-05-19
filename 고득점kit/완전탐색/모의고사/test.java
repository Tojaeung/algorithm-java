package 고득점kit.완전탐색.모의고사;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

// https://school.programmers.co.kr/learn/courses/30/lessons/42840
// Level 1
class test {
	@Test
	void test1() {
		int[] anwsers = {1, 2, 3, 4, 5};
		int[] output = {1};
		int[] anwser = Solution.solution(anwsers);

		assertThat(anwser).containsOnly(output);
	}

	@Test
	void test2() {
		int[] anwsers = {1, 3, 2, 4, 2};
		int[] output = {1, 2, 3};
		int[] anwser = Solution.solution(anwsers);

		assertThat(anwser).containsOnly(output);
	}
}
