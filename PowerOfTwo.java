/*
 * The printPOWERIfPowerOfTwoAndIntIfNot(int maxNum) method prints, for integers from 0 to 'maxNum' inclusive:
 * 
 * - The integer itself if it is NOT a number to the power of two, i.e. if the number in question is 'x' then there is no integer 'y' such that such that 2^y equals x.
 * - 'POWER' if the integer is a power of two. 
 */

public class PowerOfTwo {

	private static void printPOWERIfPowerOfTwoAndIntIfNot(int maxNum) {
		for (int i = 0; i < maxNum + 1; i++) {
			if (isPowerOfTwo(i)) {
				System.out.println("POWER");
			} else {
				System.out.println(i);
			}
		}
	}

	private static Boolean isPowerOfTwo(int num) {
		// if 2^x = num, Math.log(num) / Math.log(2) returns the value of x
		// as per https://stackoverflow.com/questions/3305059/how-do-you-calculate-log-base-2-in-java-for-integers
		double exponentAsInt = (int) (Math.log(num) / Math.log(2)); // Zeros everything after the decimal point.
		// Does 2 to the power of 'exponentAsInt' equal 'num'? If so, 'num' fulfils the criteria for being a power of 2.
		// This check avoids the problem of potential problems arising from floating point number errors if 
		// (int) (Math.log(num) / Math.log(2)) == Math.log(num) / Math.log(2)
		// had been used to check if the exponent is an integer. 
		if (Math.pow(2, exponentAsInt) == num && num > 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		printPOWERIfPowerOfTwoAndIntIfNot(512);
	}
}
