public class FindSecondMax {
    public static void main(String[] args) {
        int arr[] = {10, 42, 45, 39, 29, 14,444,11};

        int min = Integer.MAX_VALUE; 
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min; // Update secondMin to previous min
                min = arr[i];    // Update min to the new smallest value
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i]; // Update secondMin if the current element is between min and secondMin
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum value found.");
        } else {
            System.out.println("The Second Minimum number is: " + secondMin);
        }
    }
}
