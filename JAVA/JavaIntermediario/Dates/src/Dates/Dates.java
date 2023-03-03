package Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Dates {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date dt1 = new Date();
		Date dt2 = new Date(System.currentTimeMillis());
		Date dt3 = new Date(0L);
		Date dt4 = new Date(1000L * 60L * 60L * 5L);

		System.out.println("dt1: "+ dt1);
		System.out.println("dt2: "+ dt2);
		System.out.println("dt3: "+ dt3);
		System.out.println("dt4: "+ dt4);

		System.out.println("-------------------");
		System.out.println("dt1: "+ sdf1.format(dt1));
		System.out.println("dt2: "+ sdf1.format(dt2));
		System.out.println("dt3: "+ sdf1.format(dt3));
		System.out.println("dt4: "+ sdf1.format(dt4));

		System.out.println("-------------------");
		System.out.println("dt1: "+ sdf2.format(dt1));
		System.out.println("dt2: "+ sdf2.format(dt2));
		System.out.println("dt3: "+ sdf2.format(dt3));
		System.out.println("dt4: "+ sdf2.format(dt4));
		
		System.out.println("-------------------");
		System.out.println("dt1: "+ sdf3.format(dt1));
		System.out.println("dt2: "+ sdf3.format(dt2));
		System.out.println("dt3: "+ sdf3.format(dt3));
		System.out.println("dt4: "+ sdf3.format(dt4));
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Data e Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Dia do mês: " + cal.get(Calendar.DAY_OF_MONTH));
		
		
		System.out.println("Alterando a data/hora com método set");
		cal.set(Calendar.YEAR, 1990);
		cal.set(Calendar.DAY_OF_MONTH, 11);
		System.out.println("Data e Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Dia do mês: " + cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
