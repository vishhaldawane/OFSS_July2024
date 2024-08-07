package school;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
//ArrayList listOfNumbers = CalculateTest.addedNumbers();
//CalculateTest calcTest = new CalculateTest(3,1,2);
@RunWith(Parameterized.class)
public class CalculateTest {
	private int expected;
	private int first;
	private int second;

	public CalculateTest(int expectedResult, int firstNumber, int secondNumber) {
		this.expected = expectedResult;
		this.first = firstNumber;
		this.second = secondNumber;
	}

	//Annotation for a method which provides parameters 
	//to be injected into the test class constructor' by Parameterized. 
	//The method has to be public and static.
	@Parameters
	public static Collection addedNumbers() {
		return Arrays.asList(
				new Integer[][] { 
					{ 3, 1, 2 }, 
					{ 5, 2, 3 },
					{ 7, 3, 4 }, 
					{ 9, 4, 5 }, 
			});
	}

	@Test
	public void sum() {
		Calculate add = new Calculate();
		System.out.println("Addition with parameters : " + first + " and " + second);
		assertEquals(expected, add.sum(first, second)); //3,1,2
	}
}


class Calculate {
	int sum(int x, int y) {
		return x+y;
	}
}





