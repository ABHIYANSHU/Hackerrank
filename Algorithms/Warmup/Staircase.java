package hackerrank;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class Staircase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        n = in.nextInt();
        for(i=n;i>0;i--)
            {
            for(j=1;j<i;j++)
                System.out.print(" ");
            for(j=i-1;j<n;j++)
                System.out.print("#");
            System.out.println();
            in.close();
        }
    }
}
