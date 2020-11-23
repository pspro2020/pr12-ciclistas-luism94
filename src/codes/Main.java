package codes;

import java.util.concurrent.CyclicBarrier;

public class Main {
	
	static final int NUM_OF_CYCLIST = 10;
	
	public static void main(String[] args) {
		CyclicBarrier barrera = new CyclicBarrier(NUM_OF_CYCLIST, new AccionBarrera("Barrera"));
		
		for (int i = 0; i < NUM_OF_CYCLIST; i++) {
			new Thread(new Ciclista(barrera), "Ciclista " + (i+1)).start();
		}

	}

}
