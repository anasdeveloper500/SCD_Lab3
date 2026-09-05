/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class Calculator1Test {
    
   private final Calculator1 calculator = new Calculator1();
@Test
void testAdd() {
assertEquals(8, calculator.add(5, 3));
assertEquals(0, calculator.add(-2, 2));
}
@Test
void testSubtract() {
assertEquals(4, calculator.subtract(10, 6));
assertEquals(-6, calculator.subtract(3, 9));
}
@Test
void testMultiply() {
assertEquals(15, calculator.multiply(3, 5));
assertEquals(0, calculator.multiply(0, 100));
}
@Test
void testDivide() {
assertEquals(2, calculator.divide(10, 5));
assertEquals(3, calculator.divide(9, 3));
}
@Test
void testDivideByZero() {
IllegalArgumentException exception = assertThrows( 
IllegalArgumentException.class,
() -> calculator.divide(10, 0)
);
assertEquals("Cannot divide by zero.", exception.getMessage());
}

   @Test
    public void testPowerNormalCase() {

        assertEquals(8, calculator.power(2, 3));
    }

    @Test
    public void testPowerBoundaryCase() {

        assertEquals(1, calculator.power(5, 0));
    }

    @Test
    public void testModulusNormalCase() {

        assertEquals(1, calculator.modulus(10, 3));
    }

    @Test
    public void testModulusBoundaryCase() {

        assertEquals(0, calculator.modulus(10, 5));
    }

    @Test
    public void testModulusWithZero() {

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.modulus(10, 0);
        });
    }
}