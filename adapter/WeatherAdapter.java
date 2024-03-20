package adapter;

public class WeatherAdapter {
    public int findTemperature(int zipCode){
        String city = null;
        if(zipCode == 19406){
            city = "king of prussia";
        }
        WeatherFinder weatherFinder = new WeatherFinderImpl();
        int temperature = weatherFinder.find(city);
        return temperature;
    }
}
