/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author maxwell
 */
public class Util {

    public static boolean tryParseInt(String value) {
        try {
            var ignore = Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean tryParseLong(String value) {
        try {
            var ignore = Long.parseLong(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean tryParseFloat(String value) {
        try {
            var ignore = Float.parseFloat(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    

}
