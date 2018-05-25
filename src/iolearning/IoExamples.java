package iolearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IoExamples {
	public static String nLetterWord(int wordLength) throws Exception {
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mahdi_B9282\\Documents\\truejavalearning\\java-programming-exercises\\file-io-1\\file.txt"))) {
			StringBuilder sb = new StringBuilder();
			line = br.readLine();
		
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				if (line != null) {
					if (line.length() == wordLength) {
						break;
					}
				} else {break;}
			}
			String everything = sb.toString();
		}
		return line;
	}
	public static String nLetterwithChar(int wordLength) throws Exception {
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mahdi_B9282\\Documents\\truejavalearning\\java-programming-exercises\\file-io-1\\file.txt"))) {
			StringBuilder sb = new StringBuilder();
			line = br.readLine();
		
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine(); 
				if (line != null) {
					String lowered = line.toLowerCase();
					if (lowered.length() == wordLength) {
						if (lowered.contains("a") && lowered.contains("b") && lowered.contains("c")) {
							break;
						}
					}
				} else {break;}
			}
		}
		return line;
	}
	
	public static String LongestWithout(String letter1, String letter2) throws Exception {
		String line;
		int longest = 0;
		String finalword = "";
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mahdi_B9282\\Documents\\truejavalearning\\java-programming-exercises\\file-io-1\\file.txt"))) {
			StringBuilder sb = new StringBuilder();
			line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				if (line == null) {break;} else {
				String lowered = line.toLowerCase();
				if (!lowered.contains(letter1) && !lowered.contains(letter2)) {
					if (longest == 0 ) {
						longest = lowered.length();
						finalword = line;
					} else {
						if (longest < lowered.length()) {
							longest = lowered.length();
							finalword = line;
						} else {
							continue;
						}
					}
				}
			}}
		}
		return finalword;
	}
	
	public static String ShortestWithout(String letter1) throws Exception {
		String line;
		int shortest = 0;
		String finalword = "";
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mahdi_B9282\\Documents\\truejavalearning\\java-programming-exercises\\file-io-1\\file.txt"))) {
			StringBuilder sb = new StringBuilder();
			line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				if (line == null) {break;} else {
				String lowered = line.toLowerCase();
				if (!lowered.contains(letter1)) {
					if (shortest == 0 ) {
						shortest = lowered.length();
						finalword = line;
					} else {
						if (shortest > lowered.length()) {
							shortest = lowered.length();
							finalword = line;
						} else {
							continue;
						}
					}
				}
			}}
		}
		return finalword;
	}
	
	@SuppressWarnings("null")
	public static void UpperCaseContain(String letter1) throws Exception {
		String line;
		List<String> writelist = new ArrayList<String>();
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mahdi_B9282\\Documents\\truejavalearning\\java-programming-exercises\\file-io-1\\file.txt"))) {
			StringBuilder sb = new StringBuilder();
			line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				if (line == null) {break;} else {
					String lowered = line.toLowerCase();
					if (lowered.contains(letter1)) {
						String result = line.toUpperCase();
						writelist.add(result);
					}
				}
				
			}
			br.close();
		}

		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Mahdi_B9282\\Documents\\truejavalearning\\java-programming-exercises\\file-io-1\\twitter-word.txt")))
		{
			for (String word : writelist) {
				  bw.write(word);
			      bw.newLine();
			}
			bw.close();
		}
		System.out.println("berhasil");
	}
		public static void main(String args[]) throws Exception {
		     System.out.println(nLetterWord(21));
		     //System.out.println(nLetterwithChar(8));
			//System.out.println(LongestWithout("a", "e"));
			//System.out.println(ShortestWithout("b"));
			//UpperCaseContain("cool");
		   }
}
	  
	

