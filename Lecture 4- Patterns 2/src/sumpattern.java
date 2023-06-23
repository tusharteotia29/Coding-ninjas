import java.util.Scanner;

public class sumpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int sum=1;
		if (n==0) {
			return;
		}
		else{
			System.out.println("1=1");
			while (i<=n-1) {
				sum=1;
				int j=1;
				if (n==1) {
					break; 
				}
				else if(n==0){
					break;
				}
				else{
					while (j<=i) {
						System.out.print(j+"+");
						j++;
						sum=sum+j;
					}
					System.out.println(j+"="+sum);
					i++;
				}
			}
		}
    }
}
