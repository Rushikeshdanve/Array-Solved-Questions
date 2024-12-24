public class FindSecondMin {
    public static void main(String[] args) {
        int arr[]={10,42,41,39,29,14};

        int Min= Integer.MIN_VALUE;
        int secondMin =Integer.MIN_VALUE;

        for( int i=0;i<arr.length;i++){
            if(arr[i]>Min){
                secondMin=Min;
                Min=arr[i];
            }else if(arr[i]<secondMin&&arr[i]!=Min){
                secondMin=arr[i];
            }
        }
        System.out.println("The second Minimum Number is :"+ secondMin);
    }
}
