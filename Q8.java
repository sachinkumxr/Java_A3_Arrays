public class Q8 {
    //Display frequency of each element in following manner
    //Frequency of 1 is 3
    //Frequency of 2 is 3
    //and so on
    static int freq(int num, int []arr, boolean[] counted)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                count++;
                counted[i] = true;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,5,4,3,2,1,5,6,7,8,9,8,7,6,5,4,3,2,1};
        boolean[] counted = new boolean[x.length];
        for(int i=0;i<x.length;i++)
        {
            if(counted[i])
                continue;
            System.out.println("Frequency of " + x[i] + " is " + freq(x[i], x,counted));
        }
    }
}
