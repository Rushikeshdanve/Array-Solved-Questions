public class FindMinimum {
    public static void main(String[] args) {
        int arr[] = {10, 30, 12, 15, 11};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) { 
                min = arr[i];
            }
        }

        System.out.println("The Minimum Number is " + min); 
    }
}
