package 고득점kit.힙.더맵게;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

// https://school.programmers.co.kr/learn/courses/30/lessons/42626?language=java
// Level 2
public class test {
	@Test
	void test1() {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;

		int answer = Solution.solution(scoville, K);
		assertThat(answer).isEqualTo(2);
	}
}
