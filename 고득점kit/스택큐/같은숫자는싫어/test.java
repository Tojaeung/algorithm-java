package 고득점kit.스택큐.같은숫자는싫어;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
// Level 1
public class test {
	@Test
	void test1() {
		int[] input = {1, 1, 3, 3, 0, 1, 1};
		int[] output = {1, 3, 0, 1};
		int[] result = Solution.solution(input);
		int[] result2 = Solution2.solution(input);

		assertThat(result).containsOnly(output);
		assertThat(result2).containsOnly(output);

	}

	@Test
	void test2() {
		int[] input = {4, 4, 4, 3, 3};
		int[] output = {4, 3};
		int[] result = Solution.solution(input);
		int[] result2 = Solution2.solution(input);

		assertThat(result).containsOnly(output);
		assertThat(result2).containsOnly(output);
	}
}
