import java.util.Scanner;
import java.lang.Math;
public class totalsalary {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int basic=s.nextInt();
        String grade=s.nextLine();
        char c=grade.charAt(0);
        if (basic>=0 && basic<=750000) {
            Double hra=0.20*basic;
            Double da=0.5*basic;
            Double pf=0.11*basic;
            if (c=='a' || c=='A') {
                int allow=1700;
                double totalsalary=basic+hra+da+allow-pf;
                System.out.println(Math.round(totalsalary));
            } else if(c=='b' || c=='B'){
                int allow=1500;
                double totalsalary=basic+hra+da+allow-pf;
                System.out.println(Math.round(totalsalary));
                
            }
            else{
                int allow=1300;
                Double totalsalary=basic+hra+da+allow-pf;
                System.out.println(Math.round(totalsalary));

            }


        }
        
    }
}
