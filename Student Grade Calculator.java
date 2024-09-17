//student grade calculator
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input of number of grades from user
        System.out.print("Enter no of grades to be entered: ");
        int n = sc.nextInt();
        //creation of grade array
        int grade[] = new int[n];
        int sum = 0;
        //input of each grade from user
        for(int i=0;i<n;i++){
            System.out.print("Enter student "+(i+1)+" Grade: ");
            grade[i] = sc.nextInt();
            sum += grade[i];
        }
        //calculation of grades average
        float avg = (float)sum/n;
        System.out.println("The average of a student is: "+avg);
    }
    
}
