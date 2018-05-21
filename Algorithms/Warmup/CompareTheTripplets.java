package hackerrank;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class CompareTheTripplets {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int i,aa=0,bb=0;
        for(i=0;i<3;i++)
            a[i]=in.nextInt();
        for(i=0;i<3;i++)
            b[i]=in.nextInt();
        for(i=0;i<3;i++){
            if(a[i]>b[i])
                aa++;
            if(a[i]<b[i])
                bb++;
        }
        System.out.print(aa+" "+bb);
        in.close();
    }
}
