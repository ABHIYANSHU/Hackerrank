package hackerrank;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class DiagonalDifference {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,i,j,sum1=0,sum2=0;
        N=sc.nextInt();
        int a[][]=new int[N][N];
        for(i=0;i<N;i++)
            {
            for(j=0;j<N;j++)
                a[i][j]=sc.nextInt();
        }
        for(i=0;i<N;i++)
            {
            for(j=0;j<N;j++)
                {
                if(i==j)
                    sum1+=a[i][j];
            }
        }
        for(i=0,j=N-1;i<N;i++,j--)
            sum2+=a[i][j];
           if(sum1>=sum2)
               System.out.println((sum1-sum2));
           else
        	   System.out.println((sum2-sum1));
       sc.close();
    }
}
