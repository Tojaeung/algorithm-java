package 폰켓몬;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/1845
// Level 1
class 폰켓몬2 {
	public static int solution(int[] nums) {
		return Arrays.stream(nums)
				.boxed() // 원시타입을 Wrapper객체로 변경 (여기서는 int -> Integer, Collection에 담기위해서...)
				.collect(Collectors.collectingAndThen(Collectors.toSet(),
						ponketmons -> Integer.min(ponketmons.size(), nums.length / 2)));
	}
}
