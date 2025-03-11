public class Q3 {
    public static void main(String[] args) {
        //Display largest number from the numbers of both arrays
        int[] x={123,34,56,787,343,787,347,56};
        int[] y={232,35345,23,3543,232,454,67,3};
        int max=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>max)
                max=x[i];
            if(y[i]>max)
                max=y[i];
        }
        System.out.println(max);
    }
}
