// Author: Sharika
// Exercise 7: Financial Forecasting using Recursion

package Financial_Forecasting_Exercise7;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return currentValue;
        } else {
            // Recursive case
            double nextValue = currentValue * (1 + growthRate);
            return calculateFutureValue(nextValue, growthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        double currentValue = 1000; // Starting amount
        double growthRate = 0.05;   // 5% growth rate
        int years = 5;              // Prediction for 5 years

        double futureValue = calculateFutureValue(currentValue, growthRate, years);
        System.out.println("Predicted future value after " + years + " years: " + futureValue);
    }
}

/*
 * Time Complexity:
 * - This recursive method has time complexity O(n), where n is the number of years.
 * - Each call reduces the years by 1, so there are n calls.

 * Optimization:
 * - For simple cases like this, recursion works fine.
 * - For very large n, an iterative loop or memoization would avoid stack overflow and be more efficient.
 */
