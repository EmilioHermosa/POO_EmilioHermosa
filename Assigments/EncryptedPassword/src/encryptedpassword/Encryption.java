
package encryptedpassword;

import java.io.UnsupportedEncodingException;
import java.util.Base64;





public class Encryption {
    

    
    public static String encriptar(String s) throws UnsupportedEncodingException{
        return Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
    }
    
    public static Password desencriptar(String s) throws UnsupportedEncodingException{
        byte[] decode = Base64.getDecoder().decode(s.getBytes());
        return new Password(decode, "utf-8");
    }
    
}
