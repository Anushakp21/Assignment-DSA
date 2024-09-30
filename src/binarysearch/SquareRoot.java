package binarysearch;

public class SquareRoot {
    public static void main(String[] args) {
        int number = 50; // Change this number to test different values
        double precision = 0.01; // Specify the precision
        
        double sqrt = findSquareRoot(number, precision);
        System.out.printf("The square root of %d is approximately %.2f\n", number, sqrt);
    }

    public static double findSquareRoot(int x, double precision) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot find the square root of a negative number");
        }

        // Step 1: Find the integer part of the square root
        int low = 0, high = x;
        int intSqrt = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == x) {
                intSqrt = mid; // Exact square root found
                break;
            } else if (mid * mid < x) {
                intSqrt = mid; // Update intSqrt
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        // Step 2: Fine-tune the result up to the specified precision
        double result = intSqrt;
        double increment = 0.1; // Start with an increment of 0.1

        // Loop until we reach the specified precision
        while (increment >= precision) {
            while ((result + increment) * (result + increment) <= x) {
                result += increment; // Increment the result
            }
            increment /= 10; // Decrease the increment for finer precision
        }
        
        return result; // Return the final result
    }
}

