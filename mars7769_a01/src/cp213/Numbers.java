package cp213;

/**
 * @author Michael Marsillo 169057769
 * @version 2024-09-01
 */
public class Numbers {

    /**
     * Determines closest value of two values to a target value.
     *
     * @param target the target value
     * @param v1     first comparison value
     * @param v2     second comparison value
     * @return one of v1 or v2 that is closest to target, v1 is the value chosen if
     *         v1 and v2 are an equal distance from target
     */
    public static double closest(final double target, final double v1, final double v2) {

	// your code here
	double v1Distance = Math.abs(target - v1);
	double v2Distance = Math.abs(target - v2);

	if (v1Distance < v2Distance) {
	    return v1;
	} else if (v2Distance < v1Distance) {
	    return v2;
	} else {
	    return v1;
	}

    }

    /**
     * Determines if n is a prime number. Prime numbers are whole numbers greater
     * than 1, that have only two factors - 1 and the number itself. Prime numbers
     * are divisible only by the number 1 or itself.
     *
     * @param n an integer
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(final int n) {

	// your code here
	if (n < 2) {
	    return false;
	}

	if (n == 2) {
	    return true;
	}

	if (n % 2 == 0) {
	    return false;

	}

	for (int i = 3; i <= Math.sqrt(n); i++) {
	    if (n % i == 0) {
		return false;
	    }
	}
	return true;
    }

    /**
     * Sums and returns the total of a partial harmonic series. This series is the
     * sum of all terms 1/i, where i ranges from 1 to n (inclusive). Ex:
     *
     * n = 3: sum = 1/1 + 1/2 + 1/3 = 1.8333333333333333
     *
     * @param n an integer
     * @return sum of partial harmonic series from 1 to n
     */
    public static double sumPartialHarmonic(final int n) {

	// your code here
	double sum = 0.0;

	if (n > 0) {
	    for (int i = 1; i <= n; i++) {
		sum += 1.0 / i;
	    }
	}
	return sum;
    }

}
