public class Q10 {
    public static void main(String[] args) {
//        Given an integer array, find a maximum product of a triplet in the array
//        Input:  int []arr=[10,3,5,6,20]
//        Output: 1200
//        Explanation: Multiplication of 10, 6 and 20
        int []arr={10,3,5,6,20};
        int max1 = Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3)
                max3=arr[i];
        }
        System.out.println(max1*max2*max3);
    }
}
