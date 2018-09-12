package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {
	public void testAdd() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(4, solver.add(2, 2));
	}
	
	public void testSubtract() {
		ArithmeticSolver solver = newArithmeticSolver();
		
		assertEquals(2, solver.subtract(4,2));
		
	}
}
