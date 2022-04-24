/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

/**
 *
 * @author ADMIN
 */
public class Encoder {
    public static String shiftEncode(String shift)
    {
        switch(shift){
            case "MORNING" :
                return "M";
            case "EVENING":
                return "E";
            case "NOON":
                return "N";
           
        }
        return shift;
    } //end ShiftEncode methode 
    public static String groupEncode(String group)
    {
        switch(group)
        {
            case "MEDICAL":
                return "M";
            case "ENGINEERING":
                return "E";
            case "COMERCE":
                return "C";
            case "GENERAL":
                return "G";
        }
        return group;
    } //end groupDecode method 
    public static String genderEncode(String gender)
    {
        switch(gender)
        {
            case "Male" :
                return "M";
            case "Female":
                return "F";
        }
        return gender;
        } //end gender method here 
    
}
