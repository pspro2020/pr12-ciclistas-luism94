package codes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccionBarrera implements Runnable {

	private int numeroEtapa = 0;
	DateTimeFormatter formatter;
	private String name;
	
	public AccionBarrera(String name) {
		this.name = name;
		formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	}

	@Override
	public void run() {
		switch (numeroEtapa) {
		case 0:
			System.out.println(LocalDateTime.now().format(formatter) + " --- " + name + " --- Comienza la etapa");
			numeroEtapa++;
			break;
		case 1:
			System.out.println(LocalDateTime.now().format(formatter) + " --- " + name + " --- De vuelta a casa");
			numeroEtapa++;
			break;
		case 2:
			System.out.println(LocalDateTime.now().format(formatter) + " --- " + name + " --- Etapa finalizada");
			numeroEtapa++;
			break;
		}
		
	}
	
}
