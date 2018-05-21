package hackerrank;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class MinMaxSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] a = new long[5];
        long sum=0,min=0,max=0;
        a[0]=in.nextLong();
        min=a[0];
        max=a[0];
        sum=a[0];
        for(int i=1; i < 5; i++){
            a[i] = in.nextLong();
            sum+=a[i];
            if(a[i]<min)
            min=a[i];
            if(a[i]>max)
                max=a[i];
        }
        System.out.print((sum-max)+" "+(sum-min));
        in.close();
    }
}
