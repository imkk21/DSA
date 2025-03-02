import java.util.Scanner;

public class RomanToInteger {

    public int romanToInt(String s) {
        int[] romanValues = new int[128];
        
        romanValues['I'] = 1;
        romanValues['V'] = 5;
        romanValues['X'] = 10;
        romanValues['L'] = 50;
        romanValues['C'] = 100;
        romanValues['D'] = 500;
        romanValues['M'] = 1000;

        int result = 0;

        for (int i = 0; i + 1 < s.length(); ++i) {
            if (romanValues[s.charAt(i)] < romanValues[s.charAt(i + 1)]) {
                result -= romanValues[s.charAt(i)];
            } else {
                result += romanValues[s.charAt(i)];
            }
        }

        return result + romanValues[s.charAt(s.length() - 1)];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RomanToInteger converter = new RomanToInteger();
        String romanNumeral = scanner.nextLine();
        int result = converter.romanToInt(romanNumeral);
        System.out.println(result);
        
        scanner.close();
    }
}
