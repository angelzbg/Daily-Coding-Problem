package dcp;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Good morning! Here's your coding interview problem for today.
		 * This problem was asked by Twitter.
		 * Implement an autocomplete system. That is, given a query string s and a set of all possible query strings,
		 * return all strings in the set that have s as a prefix.
		 * For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
		 * Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
		 */
		
		ArrayList<String> matches = getMatchingPrefix("de", new String[]{"dog", "deer", "deal"});
		System.out.println("Matches:");
		for(String s : matches) {
			System.out.println(s);
		}
	}
	
	private static ArrayList<String> getMatchingPrefix(String s, String[] strings) {
		ArrayList<String> matches = new ArrayList<>();
		for(int i=0; i<strings.length; i++) {
			if(strings[i].startsWith(s)) {
				matches.add(strings[i]);
			}
		}
		return matches;
	}

}