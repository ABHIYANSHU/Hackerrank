package hackerrank;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class GradingStudents {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int grade;
        for(int i=0; i < n; i++){
            grade = in.nextInt();
            if(grade<38){
                System.out.println(grade);
            }
            else{
                if(grade%5>2)
                    System.out.println((5-(grade%5))+grade);
                else
                    System.out.println(grade);
            }
        }        
        in.close();
    }
}
