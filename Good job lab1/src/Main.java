import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String place:");
        String s = sc.nextLine();

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                counter++;
            }
        }
        char [] chars = new char[counter];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                chars[j++] = s.charAt(i);
            }
        }
        System.out.println("number of elements: " + chars.length);
        System.out.println("array elements: ");
        for (char ch : chars) {
            System.out.print(ch);
        }
        sc.close();
    }
}
