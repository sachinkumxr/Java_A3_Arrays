public class Q1 {
    public static void main(String[] args) {
        //Display those numbers that are greater than their adjacent number
        int []x = {123,34,516,87,343,787,347,676};
        for(int i=0;i<x.length;i++)
        {
            if(i==0)
            {
                if(x[i]>x[i+1])
                    System.out.print(x[i] + " ");
            }
            else if(i==x.length-1)
            {
                if(x[i]>x[i-1])
                    System.out.print(x[i] + " ");
            }
            else if(x[i]>x[i-1]&&x[i]>x[i+1])
                System.out.print(x[i] + " ");
        }
    }
}
