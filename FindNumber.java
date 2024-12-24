public class FindNumber {
    public static void main(String[]args){
        int arr []={10,20,30,40,50,60};
        int target=30;

        for(int i=0;i<arr.length;i++){
            System.out.println((arr[i]==target)? "Element" + target + "found at index: : " +i : "  ");
        }
    }
}
