package GHWClass10;

public class HW08 {

	public static void main(String[] args) {
		
		// 8. Maximum and minimum number in the array?

		int[] number = { 35, 78, 93, 54, 102, 40 };
		int max = number[0];
		int min = number[0];

		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];

			} else if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("Lagest element in array is = "+max);
		System.out.println("Smallest element in array is = "+min);
	}

}
