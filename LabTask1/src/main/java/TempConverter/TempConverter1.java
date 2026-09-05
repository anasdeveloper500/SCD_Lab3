/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TempConverter;

/**
 *
 * @author DELL
 */
public class TempConverter1 {

    public double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public double celsiusToKelvin(double c) {
        return c + 273.15;
    }
}
