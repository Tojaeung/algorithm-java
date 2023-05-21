package 고득점kit.해시.전화번호목록;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java
// Level 2
class Solution2 {
	public static boolean solution(String[] phone_book) {

		// 정렬한다.
		Arrays.sort(phone_book);

		// 큰숫자는 절대 작은숫자의 접두어가 될수없다.
		for (int i = 0; i < phone_book.length - 1; i++)
			if (phone_book[i + 1].startsWith(phone_book[i]))
				return false;

		// 접두어가 없으면 true 리턴
		return true;
	}
}

