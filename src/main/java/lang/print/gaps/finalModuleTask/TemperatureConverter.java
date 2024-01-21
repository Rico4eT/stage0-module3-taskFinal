package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float fahrenheit = (float) temperatureCelsius;
        System.out.println(fahrenheit * 9 / 5 + 32);
    //  System.out.println(((float)temperatureCelsius * 9 / 5) + 32); Second method in one line
    }
}
