package 고득점kit.해시.전화번호목록;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java
// Level 2
class Solution {
	public static boolean solution(String[] phone_book) {
		// 해쉬맵 만든다.
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < phone_book.length; i++)
			hm.put(phone_book[i], 1);

		// 모든 전화번호의 접두어가 해쉬맵에 존재하는지 확인
		for (String phoneNumber : phone_book) {
			for (int i = 1; i < phoneNumber.length(); i++) {
				if (hm.containsKey(phoneNumber.substring(0, i)))
					return false;
			}
		}

		// 접두어가 없으면 true 리턴
		return true;
	}
}
