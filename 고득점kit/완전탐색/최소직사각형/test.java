package 고득점kit.완전탐색.최소직사각형;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class test {
	@Test
	void test1() {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int output = 4000;

		int answer = Solution.solution(sizes);
		assertThat(answer).isEqualTo(output);

	}

	@Test
	void test2() {
		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int output = 120;

		int answer = Solution.solution(sizes);
		assertThat(answer).isEqualTo(output);

	}

	@Test
	void test3() {
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		int output = 133;

		int answer = Solution.solution(sizes);
		assertThat(answer).isEqualTo(output);

	}
}
