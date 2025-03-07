package array;

import java.util.Arrays;

public class PlusOne_66 {

	/*
	 * Input: digits = [1,2,3] Output: [1,2,4]; Input: digits = [9] Output: [1,0]
	 */

	
	// Beats - 100%
	public static int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		while (i >= 0) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
			i--;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	// Beats - 4%
	public int[] plusOne1(int[] digits) {
		boolean allNine = Arrays.stream(digits).allMatch(digit -> digit == 9);
		int origLen = digits.length;
		int newLen = origLen;
		if (allNine) {
			newLen++;
		}
		int[] result = new int[newLen];
		int remainder = 1;
		int digit = 0;
		while (newLen > 0) {
			if (origLen >= 1) {
				digit = digits[origLen - 1] + remainder;
			} else {
				digit = remainder;
			}
			result[newLen - 1] = digit % 10;
			remainder = digit / 10;
			newLen--;
			origLen--;
		}
		return result;
	}

	public static void main(String args[]) {
		int[] digits = new int[] { 8, 9, 9, 9 };
		for (int digit : plusOne(digits)) {
			System.out.print(digit);
		}
	}
}
