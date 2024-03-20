package adapter;

public class WeatherUI {

    public void showTemperature(int zipCode) {
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println("Temperature in: " + zipCode + " is now: " + adapter.findTemperature(zipCode) + " degrees");
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemperature(19406);
    }
}
