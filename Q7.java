public class Q7 {
    public static void main(String[] args) {
        //Display those elements from first array that are not present in second array
        int[] x={11,5,67,23,49,90,45};
        int[] y={45,19,11,67,567,2,5};
        boolean present = false;
        for(int i=0;i<x.length;i++)
        {
            present = false;
            for(int j=0;j<y.length;j++)
            {
                if (x[i] == y[j])
                {
                    present = true;
                    break;
                }
            }
            if (!present)
            {
                System.out.print(x[i] + " ");
            }
        }
    }
}
