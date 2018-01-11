import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
		Calc calc = new Calc();
		assertTrue(calc.add(1, 2) == 3);
	}
	@Test
	public void testSub() {
		Calc calc = new Calc();
		assertTrue(calc.subtract(3, 1) == 2);
	}
	@Test
	public void testMul() {
		Calc calc = new Calc();
		assertTrue(calc.multiply(4, 5) == 20);
	}
}
