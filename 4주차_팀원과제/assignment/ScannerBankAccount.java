package assignment;

import java.util.Scanner;

public class ScannerBankAccount {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int balance=0;
		boolean operation=true;
		
		while(operation) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			
			System.out.print("선택> ");
			String input=scanner.nextLine();
			if(input.equals("1")) {
				System.out.print("예금액> ");
				balance+=scanner.nextInt();
				scanner.nextLine();
				System.out.println();
			} else if(input.equals("2")) {
				System.out.print("출금액> ");
				balance-=scanner.nextInt();
				scanner.nextLine();
				System.out.println();
			} else if(input.equals("3")) {
				System.out.print("잔고> ");
				System.out.println(balance);
				System.out.println();
			} else if(input.equals("4")) {
				operation=false;
				break;
			} else {
				System.out.println("1~4번 중 다시 선택해주세요.\n");
			}
		}
		
		System.out.println("\n프로그램 종료");
	}

}
