package 고득점kit.정렬.k번째수;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class test {
	@Test
	void test1() {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] output = {5, 6, 3}; // 실행결과

		int[] answer = Solution.solution(array, commands);
		int[] answer2 = Solution2.solution(array, commands);
		assertThat(answer).containsOnly(output);
		assertThat(answer2).containsOnly(output);

	}
}
