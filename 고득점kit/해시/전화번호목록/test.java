package 고득점kit.해시.전화번호목록;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java
// Level 2
public class test {
	@Test
	void test1() {
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer = Solution.solution(phone_book);
		boolean answer2 = Solution2.solution(phone_book);

		assertThat(answer).isEqualTo(false);
		assertThat(answer2).isEqualTo(false);
	}

	@Test
	void test2() {
		String[] phone_book = {"123", "456", "789"};
		boolean answer = Solution.solution(phone_book);
		boolean answer2 = Solution2.solution(phone_book);

		assertThat(answer).isEqualTo(true);
		assertThat(answer2).isEqualTo(true);
	}

	@Test
	void test3() {
		String[] phone_book = {"12", "123", "1235", "567", "88"};
		boolean answer = Solution.solution(phone_book);
		boolean answer2 = Solution2.solution(phone_book);

		assertThat(answer).isEqualTo(false);
		assertThat(answer2).isEqualTo(false);
	}
}
