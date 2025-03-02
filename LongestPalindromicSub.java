import java.util.Scanner;

public class LongestPalindromicSub{

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }

        return longest;
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {  
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = longestPalindrome(input);
        System.out.println(result);
        scanner.close();
    }
}



/*
        class Solution {
    private int start = 0;
    private int end = 0;

    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        helper(s.toCharArray(), 0);
        return s.substring(start, end + 1);
    }

    public void helper(char[] arr, int i) {
        if(i >= arr.length - 1) return;

        int right = i;
        int left = i;

        while(right < arr.length - 1 && arr[right] == arr[right + 1]) {
            right++;
        }

        i = right;

        while(left > 0 && right < arr.length - 1 && arr[left - 1] == arr[right + 1]) {
            left--;
            right++;
        }

        if(end - start < right - left) {
            end = right;
            start = left;
        }

        helper(arr, ++i);
    } */