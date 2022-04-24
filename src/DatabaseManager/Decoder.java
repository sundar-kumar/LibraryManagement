/*/()
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

/**
 *
 * @author ADMIN
 */
public class Decoder {
    public static String shiftDecode(String shift)
    {
        switch(shift)
        {
            case "M":
                return "MORNING";
            case "E":
                return "EVENING";
            case "N":
                return "NOON";
        }
        return shift;
    } //end shift method 
    public static String groupDecode(String group)
    {
        switch(group)
        {
            case "M":
                return "MEDICAL";
            case "E":
                return "ENGINEERING";
            case "C":
                return "COMERCE";
            case "G":
                return "GENERAL";
        }
        return group;
    } //end group method 
    public static String genderdecode(String gender)
    {
        switch(gender)
        {
            case "M":
                return "Male";
                
            case "F":
                return "Female";
        }
        return gender;
    }
    
}
