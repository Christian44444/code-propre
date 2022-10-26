package ex4;


import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Classe qui formate une date 
 * @author cmich
 *
 */
public class DateUtils {

	/**
	 * @param pattern
	 * @param date
	 * @return String
	 */
	public static String Format(String pattern, Date date) {
		if (pattern.equals("")) {
			pattern = "dd/MM/yyyy HH:mm:ss\"";
		} 
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
	
}
