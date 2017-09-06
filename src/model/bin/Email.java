/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author guilh
 */
public class Email {
    private String email;
    
    

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        
        boolean emailValido = false;
        
        if(!email.equals("")){
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()){
                this.email = email;
                return true;
            }else{
                return false;
            }               
        }else{
            return false;
        }       
    }
    
}
