/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Ness'ti
 *
 */
public class TestDates {

	public static void main(String[] args) {

		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");

		@SuppressWarnings("deprecation")
		Date date1 = new Date(121, 1, 8, 11, 17, 35);

		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2021, 1, 8);

		Date date2 = calendar1.getTime();
		System.out.println(formateur1.format(date2));

		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		@SuppressWarnings("deprecation")
		Date date3 = new Date(116, 04, 19, 23, 59, 30);
		System.out.println(formateur2.format(date3));
	}
}
