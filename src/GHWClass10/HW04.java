package GHWClass10;

public class HW04 {

	public static void main(String[] args) {

		// 4. Create a 2D array of integers. Develop a program which will
		// calculate the sum of even & odd Numbers for that array.

		int[][] a = { { 10, 20, 11 }, { 23, 24, 15 }, { 21, 22, 31, }, };
		int even = 0;
		int odd = 0;

		for (int i = 0; i < a.length; i += 1) {
			for (int j = 0; j < a[i].length; j++)
				if (a[i][j] % 2 == 0) {
					even = even + a[i][j];
				} else {
					odd = odd + a[i][j];
				}
		}
		System.out.println("The Sum of even numbers = " + even);
		System.out.println("The Sum of odd numbers = " + odd);
	}

}
