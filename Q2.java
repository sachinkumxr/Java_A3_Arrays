import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //Accept a number from user and display frequency/occurrence of accepted number in array
        int[] x={10,20,30,50,10,20,10,30,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int count=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==a)
                count++;
        }
        System.out.println(count);
    }
}
