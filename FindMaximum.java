public class FindMaximum {
    public static void main(String[]args){
        int [] arr={10,30,12,11,15};
        int max =arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The Maximum Number is "+ max); 
    }
}
//initial max 10
//compare arr[1]=30 and max =10 update 30
//comapre arr[2]=12 and max 30 No Change
//so on...
//loop end 