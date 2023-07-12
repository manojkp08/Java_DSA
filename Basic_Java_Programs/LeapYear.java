package tutorial1.Basic_Java_Programs;
import java.io.*;
import java.util.*;
// class for leap year
public class LeapYear{
    public static void isLeapYear(int year){
        // flag to take non leap year by default
        boolean is_leap_year = false;

        // If leap year is divided by 4
        if(year % 4 == 0){
            is_leap_year = true;
            // now to identify if the year is a century year or not.
            if(year % 100 == 0){
                // checking if year is divided by 400 or not 
                if(year % 400 == 0){
                    is_leap_year = true;
                }
                else{
                    is_leap_year = false;
                }
            }
        }
        // after landing fail in the above condition
        else{
            // flag dealing non leap year
            is_leap_year = false;
        }
        if(!is_leap_year){
            System.out.println("Year "+year+" is a Non Leap year");
        }
        else{
            System.out.println("Year "+year+" is a Leap year");
        }
    }
    // this is the class which will be used to call our function.
    public static void main(String args[]){
        // calling the function by giving a leap year which is also a century year
        isLeapYear(2000);
        // calling the function by giving a non leap year
        isLeapYear(2002);

    }
}