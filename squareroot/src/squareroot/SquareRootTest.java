package squareroot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareRootTest {
	/** 
	 * Returns the squareroot, rounded down of the given number.
	 * @pre The fiven number is nonnegative
	 * 		| 0 <= x
	 * @post The square of the result is not greater than the given number
	 * 		|  result * result <=x
	 * @post the result is the greatest number whose  square is not greater than the given number
	 * 		|x<(result+1)*(result+1)
	 * @param x
	 * @return
	 */
	
	int squareRoot(int x) {
		int result =0;
		while(result *result<=x)
			result++;
		return result-1;
	}

	@Test
	void test() {
		assert squareRoot(9)==3;
		assert squareRoot(10)==3;
		assert squareRoot(16)==4;
	}

}
