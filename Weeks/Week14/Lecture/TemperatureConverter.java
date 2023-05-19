/*
Problem: Temperature Converter
Write a program that converts temperatures between Celsius and Fahrenheit. The program should take user input for the temperature value and the unit (C or F). It should then convert the temperature to the other unit and display the result. The program should handle any invalid inputs and throw appropriate exceptions.

Requirements:

If the user enters an invalid unit (neither C nor F), throw a custom exception called InvalidUnitException.
If the user enters an invalid temperature value (e.g., non-numeric input), throw a NumberFormatException.
Use separate methods for converting Celsius to Fahrenheit and Fahrenheit to Celsius.import java.util.Scanner;
*/
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature value: ");
        String inputTemperature = scanner.nextLine();
        
        System.out.print("Enter the unit (C/F): ");
        String inputUnit = scanner.nextLine();
        
        try {
            double temperature = Double.parseDouble(inputTemperature);
            double result;
            
            if (inputUnit.equalsIgnoreCase("C")) {
                result = convertCelsiusToFahrenheit(temperature);
                System.out.println(temperature + "°C is equal to " + result + "°F");
            } else if (inputUnit.equalsIgnoreCase("F")) {
                result = convertFahrenheitToCelsius(temperature);
                System.out.println(temperature + "°F is equal to " + result + "°C");
            } else {
                throw new InvalidUnitException("Invalid unit: " + inputUnit);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature value: " + inputTemperature);
        } catch (InvalidUnitException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

class InvalidUnitException extends Exception {
    public InvalidUnitException(String message) {
        super(message);
    }

    public InvalidUnitException(){
	super("Invalid unit was given!");
	}
}
