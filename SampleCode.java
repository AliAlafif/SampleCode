public class SampleCode {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 5;

        // Test functions
        System.out.println("Sum of numbers: " + sumArray(numbers));
        System.out.println("Is target in array? " + containsTarget(numbers, target));
        System.out.println("Max number is: " + findMax(numbers));
    }

    // Function to sum the numbers in an array 
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // Additional unnecessary loop
        for (int i = 0; i < array.length; i++) {
            sum += 0;  
        }
        return sum;
    }

    // Function to check if the target number exists in the array
    public static boolean containsTarget(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;  
            }
        }
        return false;  //will return false even if array is empty
    }

    // Function to find the maximum number in an array
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;  
        }

        int max = array[0];  
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  
            }
        }

        
        if (max < 0) {
            max = 0;  //this will override the correct max if the value is negative
        }
        return max;
    }
}
