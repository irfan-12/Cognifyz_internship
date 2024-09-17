//temperature conversion from celsius to fahrenheit and fahrenheit to celsius
import java.util.*;
class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.print("Enter the temperature: ");
        float temp = sc.nextFloat();
        //input of measured temperature
        System.out.print("Enter the units of measured (C is for celsius and F for fahrenheit) : ");
        char units = sc.next().charAt(0);
        //logic
        if(units == 'C' || units == 'c') {
            float converted = celsiusToFahrenheit(temp);
            if(converted >= 90.0f){
                System.out.println(converted+"°F"+"🥵");
            }
            else if(converted < 90.0f && converted >= 70.0f){
                System.out.println(converted+"°F"+"⛅");

            }
            else{
                System.out.println(converted+"°F"+"🥶");
            }
        }
        else if(units == 'F' || units == 'f'){
            float converted = fahrenheitToCelsius(temp);
            if(converted >= 32.0f){
                System.out.println(converted+"°C"+"🥵");
            }
            else if(converted <32.0f && converted >= 21.11f){
                System.out.println(converted+"°F"+"⛅");
            }
            else{
                System.out.println(converted+"°F"+"🥶");
            }
        }
        else{
            System.out.println("Please enter the valid units of temperature(C-celsius or F-fahrenheit)");
        }
    }
    //function to convert celsius to fahrenheit
    public static float celsiusToFahrenheit(float temp){
        return (temp * 9/5)+32;
    }
    //function to convert fahrenheit to celsius
    public static float fahrenheitToCelsius(float temp){
        return (temp-32)*(5/9);
    }
}