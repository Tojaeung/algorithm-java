package 완주하지못한선수;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
// Level 1
public class test {
	@Test
	void test1() {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String result = Solution.solution(participant, completion);

		assertThat(result).isEqualTo("leo");
	}

	@Test
	void test2() {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String result = Solution.solution(participant, completion);

		assertThat(result).isEqualTo("vinko");
	}

	@Test
	void test3() {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String result = Solution.solution(participant, completion);

		assertThat(result).isEqualTo("mislav");
	}
}
