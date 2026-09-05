/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package SimpleTimer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */

    
    
    public class SimpleUtilTest {

    @Test
    public void testNormalCase() {

        SimpleUtil timer = new SimpleUtil();

        assertEquals(15, timer.secondsBetween(10, 25));
    }

    @Test
    public void testBoundaryCase() {

        SimpleUtil timer = new SimpleUtil();

        assertEquals(0, timer.secondsBetween(0, 0));
    }

    @Test
    public void testInvalidInput() {

        SimpleUtil timer = new SimpleUtil();

        assertThrows(IllegalArgumentException.class, () -> {
            timer.secondsBetween(25, 10);
        });
    }
}

