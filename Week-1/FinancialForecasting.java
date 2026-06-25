import java.util.*;
public class FinancialForecasting {
    public static List<Double> movingAverage(List<Double> data, int windowSize) {
        List<Double> forecast = new ArrayList<>();
        for (int i = 0; i <= data.size() - windowSize; i++) {
            double sum = 0;
            for (int j = i; j < i + windowSize; j++) {
                sum += data.get(j);
            }
            forecast.add(sum / windowSize);
        }
        return forecast;
    }

    public static void main(String[] args) {
        // Ex= monthly revenue data
        List<Double> revenueData = Arrays.asList(
                120.0, 130.0, 125.0, 140.0, 150.0, 160.0, 155.0, 165.0, 170.0, 180.0, 175.0, 185.0
        );

        int windowSize = 3;
        List<Double> forecast = movingAverage(revenueData, windowSize);

        System.out.println("Historical Data: " + revenueData);
        System.out.println(windowSize + "-Month Moving Average Forecast:");
        for (int i = 0; i < forecast.size(); i++) {
            System.out.printf("Month %d: %.2f\n", i + windowSize, forecast.get(i));
        }
    }
}
