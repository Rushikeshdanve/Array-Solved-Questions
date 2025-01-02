class SecondLargestGFGsolution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        
        for(int data:arr)
        {
            if(data>max){
                smax=max;
                max=data;
            }
            else if(data>smax && data!=max)
            {
                smax=data;
            }
        }
            if(smax==Integer.MIN_VALUE)
            {
                return-1;
            }
            else return smax;
    }
}