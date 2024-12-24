public class ReverseEmptyArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int arr2[]=new int[arr.length];

        System.out.print("arr2={");

        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[arr.length-1-i];

            System.out.print(arr2[i] + (i<arr.length - 1 ? ",":""));
        }
            System.out.println("}");
    }
}
