package hackerrank;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class AVeryBigSum {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,i;
        long sum=0;
        N=sc.nextInt();
        int a[]=new int[N];
        for(i=0;i<N;i++)
            {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
