import java.util.*;
public class Task4 {
    public static String passGen(int len){
        //initialization of UpperCase letters to String
        String cap_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //initialization of LowerCase letters to String
        String small_char = "abcdefghijklmnopqrstuvwxyz";
        //initialization of Special characters to String
        String spl_char = "!@#$%^&*()_-{}[].,?><|+=`~";
        //initialization of numbers to String
        String num = "0123456789";
        String result = cap_char + small_char + spl_char + num;
        Random rand = new Random();
        char []password = new char[len];
        //logic
        for(int i=0;i<len;i++){
            int ranInd = rand.nextInt(result.length());
            password[i] = result.charAt(ranInd);
        }
        return new String(password);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input of password length
        System.out.print("Enter the length to genarate password: ");
        int len = sc.nextInt();
        String genpass = passGen(len);
        System.out.println("System Generated Password: "+genpass);
        

    }
    
}
