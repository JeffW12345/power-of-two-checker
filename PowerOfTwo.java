/*
 * The printPOWERIfPowerOfTwoAndIntIfNot(int maxNum) method prints, for integers from 0 to 'maxNum' inclusive:
 * 
 * - The integer itself if it is NOT a number to the power of two, i.e. if the number in question is 'x' then there is no integer 'y' such that such that 2^y equals x.
 * - 'POWER' if the integer is a power of two. 
 */

public class PowerOfTwo {

	private static void printPOWERIfPowerOfTwoAndIntIfNot(int maxNum) {
		int next = 1;
		for (int i = 0; i < maxNum + 1; i++) {
			if (i == next) {
				System.out.println("POWER");
				next *= 2;
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		printPOWERIfPowerOfTwoAndIntIfNot(512);
	}
}
