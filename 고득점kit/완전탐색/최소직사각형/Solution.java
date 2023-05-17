package 고득점kit.완전탐색.최소직사각형;

class Solution {
	public static int solution(int[][] sizes) {
		int maxWidth = Integer.MIN_VALUE;
		int maxHeight = Integer.MIN_VALUE;

		for (int[] size : sizes) {
			int tempWidth = Math.max(size[0], size[1]);
			int tempHeight = Math.min(size[0], size[1]);

			if (tempWidth > maxWidth) {
				maxWidth = tempWidth;
			}
			if (tempHeight > maxHeight) {
				maxHeight = tempHeight;
			}
		}
		return maxWidth * maxHeight;
	}
}
