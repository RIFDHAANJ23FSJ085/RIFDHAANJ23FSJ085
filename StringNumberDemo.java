package zohoString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringNumberDemo {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String st=sc.nextLine();
	sc.close();
	StringNumberDemo.letterCombinations(st);
}
	public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
        
        backtrack(combinations, digitToLetters, digits, new StringBuilder(), 0);
        
        return combinations;
    }
    
    private static void backtrack(List<String> combinations, Map<Character, String> digitToLetters, String digits, StringBuilder current, int index) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);
        
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(combinations, digitToLetters, digits, current, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
