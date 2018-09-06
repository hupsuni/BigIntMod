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
		long encryptedNumbers[] = new long[] { 1 };
		// Replace below with your values for lambda and miu and n
		int lambda = 1;
		int miu = 1;
		BigInteger n = BigInteger.valueOf( 1 );
		
		for( long e:encryptedNumbers ) {
			tally = tally.multiply( BigInteger.valueOf( e ));
		}
		tally = tally.mod( n.pow(2));
		
		System.out.println("The value of all encrypted numbers multiplied together and mod n^2: " + tally);
		
		// c^lamda mod n^2
		tally = tally.pow(lambda);
		tally = tally.mod( n.pow(2));
		System.out.println( "c^lamda mod n^2 : " + tally );
		
		// l( c^lamda mod n^2 )
		tally = tally.subtract(BigInteger.ONE);
		tally = tally.divide(n);
		
		System.out.println( "L[ c^lamda mod n^2]: " + tally );
		
		tally = tally.multiply( BigInteger.valueOf(miu));
		tally = tally.mod(n);
		
		System.out.println( "Fully Decrypted: " + tally );
	}

}
