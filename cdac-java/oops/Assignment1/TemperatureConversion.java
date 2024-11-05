public class TemperatureConversion {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double celsiusTemp = 30.0;
        double fahrenheitTemp = celsiusToFahrenheit(celsiusTemp);
        System.out.println(celsiusTemp + "°C is equal to " + fahrenheitTemp + "°F");
    }
}
