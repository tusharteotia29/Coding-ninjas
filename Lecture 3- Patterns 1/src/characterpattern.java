import java.util.Scanner;

public class characterpattern {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while (i<=n) {
			int j=1;
			char startingchar=(char)('A'+i-1);
			while (j<=i) {
				System.out.print(startingchar);
				startingchar=(char)(startingchar+1);
				j++;
			}
			System.out.println();
			i++;	
		}	
	}
}
