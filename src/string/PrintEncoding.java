package string;

import java.util.Scanner;

public class PrintEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter code to encode");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printAllEncoding(str, "");
		sc.close();
	}

	public static void printAllEncoding(String str, String answer) {

		if (str.length() == 0) {
			System.out.println(answer);
			return;
		} else if (str.length() == 1) {
			char ch = str.charAt(0);
			if (ch == '0') {
				return;
			} else {
				int chvalue = ch - '0';
				System.out.println("chvalue=="+chvalue);
				char code = (char) ('a'+ chvalue - 1);
				System.out.println("code=="+code);
				System.out.println(answer+code);
			}
		} else {
			char ch = str.charAt(0);
			String remaininnString = str.substring(1);
			if (ch == '0') {
				return;
			} else {
				int chvalue = ch - '0';
				char code = (char) ('a'+chvalue - 1);
				printAllEncoding(remaininnString, answer + code);
			}

			String ch12 = str.substring(0, 2);
			String restString = str.substring(2);

			int ch12v = Integer.parseInt(ch12);
			if (ch12v <= 26) {
				char code = (char) ('a'+ ch12v - 1);
				printAllEncoding(restString, answer + code);
			}
		}

	}

}
