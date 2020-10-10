import java.util.*;
import java.io.*;

public class Exam_12 {
	public static void main(String[] args) throws Exception {
		// read file from the local disk
		// you need to change this line because this directory only work on my computer
		// BufferedReader br = new BufferedReader(new
		// FileReader("C:\\Users\\YOURACCOUNTNAME\\FOLDER\\FILENAME"));[1]
		// [1]“Different ways of Reading a text file in Java,” GeeksforGeeks,
		// 06-Sep-2018. [Online]. Available:
		// https://www.geeksforgeeks.org/different-ways-reading-text-file-java/.
		// [Accessed: 10-Oct-2020].
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\otter\\Downloads\\hw1.txt"));

		// read file as string
		String code = br.readLine();
		char[] arry = new char[code.length()];
		int i;

		// put the every characters in the array include space
		for (i = 0; i < code.length(); i++) {
			arry[i] = code.charAt(i);
		}

		// print whole array for check entire file inserted correctly
		for (i = 0; i < arry.length; i++) {
			System.out.print(arry[i]);
		}
		// change line
		System.out.println("\n\n");

		// separate by lexemes
		for (i = 0; i < arry.length; i++) {
			// if character is between a-z, A-Z, 0-9 print
			if ((arry[i] >= 'a' && arry[i] <= 'z') || (arry[i] >= 'A' && arry[i] <= 'Z')
					|| (arry[i] >= '0' && arry[i] <= '9')) {
				System.out.print(arry[i]);
			}
			// if array has space then change line
			else if (arry[i] == ' ') {
				System.out.println("\n");
			}
			// if character is other than a-z, A-Z, 0-9 then change line print and change
			// line
			else {
				System.out.print("\n\n" + arry[i] + "\n\n");
			}
		}
	}

}
