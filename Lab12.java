import java.util.*;

class CustomStack {
    private StringBuilder text;

    public CustomStack() {
        text = new StringBuilder();
    }

    public void insert(String value) {
        text.append(value);
    }


    public void delete(int value) {
        if (value <= text.length()) {
            text.delete(text.length() - value, text.length());
        }
    }

    public char get(int value) {
        if (value >= 1 && value <= text.length()) {
            return text.charAt(value - 1); // Adjusting to 1-based indexing
        }
        return '\0'; // Return null character if index is invalid
    }

    public String getText() {
        return text.toString();
    }
}

public class Lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomStack editor = new CustomStack();

        // comma seperated input
        String input = sc.nextLine();
        String[] commands = input.split(",");

   
        for (String command : commands) {
            String[] parts = command.trim().split(" ");
            int cmdType = Integer.parseInt(parts[0]);

            switch (cmdType) {
                case 1: // Insert command
                    String value = parts[1];
                    editor.insert(value);
                    break;

                case 2: // Delete command
                    int delCount = Integer.parseInt(parts[1]);
                    editor.delete(delCount);
                    break;

                case 3: // Get command
                    int index = Integer.parseInt(parts[1]);
                    System.out.println(editor.get(index));
                    break;
            }
        }

        sc.close();
    }
}
