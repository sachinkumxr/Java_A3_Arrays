public class Q6 {
    public static void main(String[] args) {
        //Display those elements that are common in both array
        int[] x={11,5,67,23,49,90,45};
        int[] y={45,19,11,67,567,2,5};
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<y.length;j++) {
                if (x[i] == y[j]) {
                    System.out.print(x[i] + " ");
                    break;
                }
            }
        }
    }
}
