package Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherAnalyzer {

    public record WeatherData(int id, String name, double temp) {}


    public static void main(String[] args) {
        List<WeatherData> weatherDataList = Arrays.asList(
                new WeatherData(1, "New York", 75.0),
                new WeatherData(2, "Los Angeles", 80.0),
                new WeatherData(3, "Chicago", 70.0),
                new WeatherData(4, "Houston", 85.0),
                new WeatherData(5, "Phoenix", 90.0)
        );

        int k = 3;
        List<WeatherData> topCities = getTopKCities(weatherDataList, k);
        System.out.println("Top " + k + " cities by temperature:");
        topCities.forEach(System.out::println);

        List<WeatherData> topCities1 = getTopKCities1(weatherDataList, k);
        topCities1.forEach(System.out::println);

    }

    public static List<WeatherData> getTopKCities(List<WeatherData> weatherDataList, int k) {
        // Sort the list by temperature in descending order
        List<WeatherData> sortedList = weatherDataList.stream()
                .sorted(Comparator.comparingDouble(WeatherData::temp).reversed())
                .toList();

        // Get the top K cities
        return sortedList.stream().limit(k).collect(Collectors.toList());
    }


    static List<WeatherData> getTopKCities1(List<WeatherData> weatherDataList, int k) {

        return weatherDataList.stream().sorted(Comparator.comparingDouble(WeatherData::temp).reversed()).limit(k).collect(Collectors.toList());
    }
}