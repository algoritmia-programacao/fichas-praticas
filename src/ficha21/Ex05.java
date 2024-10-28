package ficha21;

public class Ex05 {
    public static void main(String[] args) {
        float temperatureInCelsius = 25f;
        System.out.println("Fahrenheit: " + temperatureInFahrenheit(temperatureInCelsius) + "ºF");
    }

    private static float temperatureInFahrenheit(float temperatureInCelsius) {
        return (1.8f * temperatureInCelsius) + 32;
    }
}
