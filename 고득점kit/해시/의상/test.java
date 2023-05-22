package 고득점kit.해시.의상;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

// https://school.programmers.co.kr/learn/courses/30/lessons/42578
// Level 2
public class test {
	@Test
	void test1() {
		String[][] clothes = {
				{"yellow_hat", "headgear"},
				{"blue_sunglasses", "eyewear"},
				{"green_turban", "headgear"}
		};

		int answer = Solution.solution(clothes);

		assertThat(answer).isEqualTo(5);
	}

	@Test
	void test2() {
		String[][] clothes = {
				{"crow_mask", "face"},
				{"blue_sunglasses", "face"},
				{"smoky_makeup", "face"}
		};

		int answer = Solution.solution(clothes);

		assertThat(answer).isEqualTo(3);
	}
}
