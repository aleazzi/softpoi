package srcdeapoyo;

import java.util.Calendar;
import java.util.Date;

//Esta clase se utiliza para el paso de parametros de fecha
public class FechayHora {

	public static Date fechaHoy(){
		return new Date();
	}
	
	public static String horaHoy(){
		Date hoy = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(hoy);
		return cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
	}

	
}
