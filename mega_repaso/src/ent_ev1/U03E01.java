package ent_ev1;
/*
 * @author jlcruz-cifp
 */
import java.util.Date;

public class U03E01
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        DNIUtils dniu = new DNIUtils();
        
//        System.out.println(dniu.letraDNI("12345678"));
//        System.out.println(dniu.checkDNI("1234567"));
//        System.out.println(dniu.checkDNI("12345678"));
//        System.out.println(dniu.checkDNI("12345678Z"));
//        System.out.println(dniu.checkDNI("12345678A"));
//        System.out.println(dniu.checkDNI("123456789Z"));
        
        String dni = "23302999-C";
        System.out.println(dniu.checkDNI(dni));
        
//        System.out.println(dniu.edad(new Date("16/05/1996")));
    }    
}