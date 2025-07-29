package skill;

import java.util.Scanner;

public class perfectnumber {
	public static void main(String[] agrs) {
		int n,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number=");
		n = sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		if(n== sum) {
			System.out.println("Perfect Number");
		}
	}
}