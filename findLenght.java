public class findLenght {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int length = findArrayLenght(arr); 
        System.out.println("Array length is = " + length); 
    }

    public static int findArrayLenght(int arr[]) {

        int count = 0;
        for(int i = 0; i < arr.length; i++) { 
            count++;
        }
        return count;
    }
}
 

