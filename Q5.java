public class Q5 {
    public static void main(String[] args) {
        //Display all prime numbers
        int[] x={123,34,56,787,343,717,347,56,17,79};
        boolean prime=true;
        for(int i=0;i<x.length;i++)
        {
            prime=true;
            for(int j=2;j<=Math.sqrt(x[i]);j++)
            {
                if(x[i]%j==0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            {
                System.out.print(x[i] + " ");
            }
        }
    }
}
