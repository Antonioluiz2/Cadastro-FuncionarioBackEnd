package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDateTime lt = LocalDateTime.now();
		System.out.println(lt);
		//Horario de londres 
		Instant is= Instant.now();
		System.out.println(is);
		
		LocalDateTime dt= LocalDateTime.parse("2022-09-26T17:02:30");
		LocalDateTime dt1= LocalDateTime.parse("2022-09-26T17:02:30");
		System.out.println(dt);
		System.out.println();
		
		DateTimeFormatter FMT= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println(dt.format(FMT));
		System.out.println(FMT.format(dt1));
		System.out.println(fmt1.format(is));
		System.out.println();
		
		
		System.out.println("Mostra todos os TimeZone ");
		System.out.println();
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		//Acrescente e reduz data
		LocalDate ds= LocalDate.now();
		LocalDate diasPassada= ds.minusDays(7);
		System.out.println(diasPassada);
		LocalDate diasSeguinte= ds.plusDays(7);
		System.out.println(diasSeguinte);
		
		LocalDate semanaSeguinte= ds.plusWeeks(7);
		System.out.println(semanaSeguinte);
		LocalDate proximosAnos= ds.plusYears(7);
		System.out.println(proximosAnos);
		
		
	}

}
