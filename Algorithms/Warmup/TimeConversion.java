package hackerrank;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class TimeConversion {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int l;
        l=time.length();
        String med = time.substring(l-2,l);
        int hr;
        String min,sec;
        hr = Integer.parseInt(time.substring(0,2));
        min = time.substring(3,5);
        sec = time.substring(6,8);
        if(med.equals("PM"))
            {
            if(hr==12)
                System.out.print(hr+":"+min+":"+sec);
            else
            System.out.print((hr+12)+":"+min+":"+sec);
        }
        else
            {
            if(hr==12)
                {
                String h = "0"+Integer.toString(hr-12);
                System.out.print(h+":"+min+":"+sec);
            }
                else
                    {
                    String h = "0"+Integer.toString(hr);
            System.out.print(h+":"+min+":"+sec);
                }
            }
        in.close();
    }
}
