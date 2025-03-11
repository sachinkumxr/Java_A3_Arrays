public class Q4 {
    public static void main(String[] args) {
        //Display second largest number
        int[] x={123,34,56,787,343,717,347,56};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>max1)
            {
                max2=max1;
                max1=x[i];
            }
            else if(x[i]>max2)
                max2=x[i];
        }
        System.out.println(max2);
    }
}
