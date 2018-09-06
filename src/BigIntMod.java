import java.math.BigInteger;

/*
 * Mainly for testing purposes, this program will take your values for n, lambda and mui
 * and then check against all your encrypted integers to see if, when multiplied, they decrypt
 * to a suitable number.
 * @author Nicholas Huppert
 */
public class BigIntMod {

	public static void main(String[] args) {
		BigInteger tally = BigInteger.ONE;
		// An array of encrypted numbers, replace the number 1 with all the values for your encrypted numbers
		long encryptedNumbers[] = new int[] {1};
		// Replace below with your values for lambda and miu and n
		int lambda = 1;
		int miu = 1;
		BigInteger n = BigInteger.valueOf(1);
		
		for( long e:encryptedNumbers ) {
			tally = tally.multiply( BigInteger.valueOf(n));
		}
		tally = tally.mod( n.pow(2));
		
		System.out.println("The value of all encrypted numbers multiplied together and mod n^2: " + tally);
		
		
		
	}

}
