package jp.co.aivick.homework2;

import java.util.Scanner;

public class TreeInRow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("何か入力してください:");
			var line = sc.nextLine();
			if (line.equals("quit")) {
				System.out.print("bye");
				break;
			}
			System.out.println(line);
		}
	}
}
