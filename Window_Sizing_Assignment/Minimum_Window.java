package Window_Sizing_Assignment;
import java.util.*;
public class Minimum_Window {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(Minwindow(s, t));

	}

	public static String Minwindow(String s, String t) {
		int[] frq_t = new int[256];
		int[] frq_s = new int[256];
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			frq_t[ch - 1]++;
		}

		int count = 0;
		int start = 0;
		int min_len = Integer.MAX_VALUE;
		int start_index = -1;

		for (int end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);
			frq_s[ch]++;
			if (frq_s[ch] <= frq_t[ch]) {
				count++;
			}
			if (count == t.length()) {
				while (frq_s[s.charAt(start)] > frq_t[s.charAt(start)] || frq_t[s.charAt(start)] == 0) {
					if (frq_s[s.charAt(start)] > frq_t[s.charAt(start)]) {
						frq_s[s.charAt(start)]--;
					}
					start++;
				}
				if (min_len > end - start + 1) {
					//min_len = Math.min(min_len, end- start + 1);
					min_len =  end- start + 1;
					start_index = start;
				}

			}
		}
		if (start_index == -1) {
			return "";
		}
		return s.substring(start_index, start_index + min_len);
	}
}