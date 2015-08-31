package ent_ev1;
import java.util.Date;
import java.util.Calendar;
/**
 * Esta clase engloba dos herramientas para
 * tratar datos "DNI" y otra para calcular la edad
 * @author JL y Salvador
 */
public class DNIUtils
{
/**
 * Calcula la letra a partir del número proporcionado
 * @param dni Cadena que contendrá el DNI para calcular su letra
 * @return Únicamente devuelve la letra correspondiente
 */
    public String letraDNI (String dni)
    {
    	// Letras en un determinado orden
        String tablaLetras="TRWAGMYFPDXBNJZSQVHLCKET";
        
        // Se pasa el DNI a int y se le realiza MOD
        int modulo = Integer.parseInt(dni) % 23;
        
        // Se coge la letra según la posición proporcionada por MOD
        String letra = tablaLetras.substring(modulo,modulo+1);
        return letra; 
    }    
    
/**
 * Calcula o comprueba la letra del DNI    
 * @param dni Cadena que contendrá el DNI con o sin letra
 * @return DNI completo (número + letra)
 * @throws IllegalArgumentException Por si se introduce algo null o vacío
 */
    public String checkDNI (String dni) throws IllegalArgumentException
    {
        String letra=""; 
        
        /* Se comprueba la longitud del DNI introducido,
         * en caso de ser menor se rellena con 0's
         */
        while (dni.length()<8)
            dni = "0" + dni;
        
        // Si continene puntos, comas o guiones se quitan
        if ((dni.contains("."))||(dni.contains(","))||(dni.contains("-")))
        {
            dni = dni.replace(".", "");
            dni = dni.replace(",", "");
            dni = dni.replace("-", "");
        }
        
        // Si la longitud es mayor da error
        if (dni.length()>9) 
            return "ERRDNI-1";
        // Si no lo es, se comprueba la letra
        else if (dni.length()==9) 
        {
            letra = dni.substring(8);
            dni = dni.substring(0,8);
            if (letra.equals(letraDNI(dni))) 
                return dni+letra;
            else
                return "ERRDNI-2"; 
        }
        /*Si es menor ergo no lleva la letra,
         * se le calcula
         */
        else 
        {
            letra = letraDNI(dni);
            return dni+letra;
        }
    }
    
/**
 * Se calculará la edad a partir de la fecha de nacimiento
 * @param nacimiento Variable de tipo Date
 * @return Edad actual
 */
    public int edad (Date nacimiento)
    {
        Calendar cal = Calendar.getInstance();
        // Crea un nuevo "calendario" con la fecha proporcionada
        cal.setTime(nacimiento);
        int an = cal.get(Calendar.YEAR);
        int mn = cal.get(Calendar.MONTH);
        int dn = cal.get(Calendar.DAY_OF_MONTH);

        // Crea otro con la fecha actual
        cal.setTime(new Date());
        int aa = cal.get(Calendar.YEAR);
        int ma = cal.get(Calendar.MONTH);
        int da = cal.get(Calendar.DAY_OF_MONTH);
       
        // Diferencia principal es entre los años
        int dif = aa-an;
       
        // -1 corresponde a que aún no ha nacido
        if (an>=aa && mn>=ma && dn>=da)
           dif=-1;
       
        // Si el mes el menor, resta otro año
        else if (mn<ma) 
            dif--;
       
        /* Si el mes es el mismo pero el día es menor,
        resta otro año */
        else if (mn==ma && dn<da) 
            dif--;

        return dif;
    }
    
    public static void main(String[]args){
    	DNIUtils dni = new DNIUtils();
    	System.out.print(dni.checkDNI("2330-2080K"));
    }
    
}