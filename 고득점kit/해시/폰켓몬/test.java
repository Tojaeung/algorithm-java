package 고득점kit.해시.폰켓몬;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class test {
	@Test
	void test1() {
		int[] nums = {3, 1, 2, 3};
		int result = Solution.solution(nums);
		int result2 = Solution2.solution(nums);
		assertThat(result).isEqualTo(2);
		assertThat(result2).isEqualTo(2);
	}

	@Test
	void test2() {
		int[] nums = {3, 3, 3, 2, 2, 4};
		int result = Solution.solution(nums);
		int result2 = Solution2.solution(nums);
		assertThat(result).isEqualTo(3);
		assertThat(result2).isEqualTo(3);
	}

	@Test
	void test3() {
		int[] nums = {3, 3, 3, 2, 2, 2};
		int result = Solution.solution(nums);
		int result2 = Solution2.solution(nums);
		assertThat(result).isEqualTo(2);
		assertThat(result2).isEqualTo(2);
	}
}
