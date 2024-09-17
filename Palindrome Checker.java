//check whether the string is panlindrome
import java.util.*;
public class Task2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String constr = str.toLowerCase();
        boolean flag = palindrome(constr);
        if(flag){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
