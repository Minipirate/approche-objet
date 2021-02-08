/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Ness'ti
 *
 */
public class TestCalendar {

	public static void main(String[] args) {

		/*
		 * Partie 1
		 */

		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2016, 4, 19, 23, 59, 30);

		SimpleDateFormat formateur3 = new SimpleDateFormat("dd/MM/yyyy");
		Date date2 = calendar1.getTime();
		System.out.println(formateur3.format(date2));

		
		/*
		 * Partie 2
		 */

		calendar1 = Calendar.getInstance();
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formateur2.format(date2));
		
		
		/*
		 * Partie 3 
		 */
		
		SimpleDateFormat formateurName = new SimpleDateFormat("EEEE d MMMM yyyy");
		System.out.println(formateurName.format(date2));
		
		formateurName = new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("ru", "RU"));
		System.out.println(formateurName.format(date2));
		
		formateurName = new SimpleDateFormat("EEEE d MMMM yyyy", Locale.CHINESE);
		System.out.println(formateurName.format(date2));
		
		formateurName = new SimpleDateFormat("EEEE d MMMM yyyy", Locale.GERMANY);
		System.out.println(formateurName.format(date2));
		
	}
}
