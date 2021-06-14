/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Admin
 */
public class FormatString {
    public String FormatName(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        str = str.toLowerCase();
        
        String temp = "";
        
        temp += String.valueOf(str.charAt(0)).toUpperCase();
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') 
                temp +=String.valueOf(str.charAt(i)).toUpperCase();
            else temp += str.charAt(i);
        }
        
        return temp;
    }
}
