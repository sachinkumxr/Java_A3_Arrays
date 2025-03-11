public class Q9 {
    public static void main(String[] args) {
        //  Display those numbers that contains digit 1
        //  Such as 123,717,17,61
        int[] x={123,34,56,787,343,717,347,56,17,79,61};
        for(int i=0;i<x.length;i++)
        {
            int a = x[i];
            while(a>0)
            {
                if(a%10==1)
                {
                    System.out.print(x[i] + " ");
                    break;
                }
                a /=10;
            }
        }
    }
}
