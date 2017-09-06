
package model.bin;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {
    private String senhaCriptografada;

    public Criptografia() {
    
    }

    public String getSenhaCriptografada() {
        return senhaCriptografada;
    }

    public void setSenhaCriptografada(String senhaCriptografada) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(senhaCriptografada.getBytes(), 0, senhaCriptografada.length());
        this.senhaCriptografada = new BigInteger(1,md.digest()).toString(16);
    }
    
    

    
    
    
}
