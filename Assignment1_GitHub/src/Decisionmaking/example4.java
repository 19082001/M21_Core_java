package Decisionmaking;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.next().charAt(0);
		switch(a)
		{
			case 'a':
				System.out.println("sita");
				break;
			case 'b':
				System.out.println("rita");
				break;
			case 'c':
					System.out.println("gita");
					break;
			default:
					System.out.println("Invalid input");
					s.close();
					
		}

	}

}
