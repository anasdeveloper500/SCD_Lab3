/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TempConverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author DELL
 */
public class TempConverter1Test {

    TempConverter1 tc = new TempConverter1();

    @Test
    public void ctof() {

        assertEquals(32.0, tc.celsiusToFahrenheit(0.0), 0.01);
    }

    @Test
    public void ftoc() {

        assertEquals(100, tc.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    public void ctok() {

        assertEquals(0.0, tc.celsiusToKelvin(-273.15), 0.01);
    }

}
