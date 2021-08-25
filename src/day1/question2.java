package day1;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		int b=scan.nextInt();
        System.out.println("multiplication:"+(a*b));
        System.out.println("division:"+(a/b));
        System.out.println("modulus:"+(a%b));
	}

}
