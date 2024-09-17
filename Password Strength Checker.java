//password strength checker

import java.util.*;

public class Task_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password to check: ");
        String password = sc.nextLine();
        passStrenCheck(password);
    }

    public static void passStrenCheck(String pass) {
        int len = pass.length();
        String spch = ".,></?':;|}{[]=+-_)(*&^%$#@!~`";
        int A = 0, a = 0, n = 0, s = 0;
        if (len < 8) {
            System.out.println("Weak Password , Please enter minimum of length(8) ");
        } else {
            for (int i = 0; i < len; i++) {
                char ch = pass.charAt(i);
                if (Character.isUpperCase(ch)) {
                    A++;
                } else if (Character.isLowerCase(ch)) {
                    a++;
                } else if (Character.isDigit(ch)) {
                    n++;
                } else if (spch.contains(String.valueOf(ch))) {
                    s++;
                }
            }
            if (A >= 1 && a >= 1 && n >= 1 && s >= 1) {
                System.out.println("Strong Password");
            } else {
                System.out.println("Weak Password");
            }
        }

    }
}
