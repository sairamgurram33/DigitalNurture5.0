package Week1_DataStructures_Algorithms;

public class Financial_Forecasting {
	    public static double forecast(double value,
	                                  double growthRate,
	                                  int years) {
	        if(years == 0) {
	            return value;
	        }
	        return forecast(value,
	                        growthRate,
	                        years - 1)
	                        * (1 + growthRate);
	    }
	    public static void main(String[] args) {

	        double result =
	            forecast(1000, 0.10, 3);

	        System.out.println(
	            "Future Value = " + result);
	    }
	}

