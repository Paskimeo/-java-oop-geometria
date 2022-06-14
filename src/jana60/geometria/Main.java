package jana60.geometria;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// aggiunto scanner e rettangolo
		Scanner scan = new Scanner(System.in);
		Rettangolo ret = new Rettangolo();
		Rettangolo retmax = new Rettangolo();
		int areaMaggiore = 0;
	
		
		//bonus
		for (int i =0; i<5 ; i++) {
			
		//richiesta altezza e larghezza
		System.out.println("inserisci l'altezza del rettangolo:");
		ret.altezza= Integer.parseInt(scan.nextLine());

		System.out.println("inserisci la larghezza del rettangolo:");
		ret.larghezza= Integer.parseInt(scan.nextLine());
		
		if (ret.area()>=areaMaggiore) {
			
			areaMaggiore = ret.area();
			retmax.altezza = ret.altezza;
			retmax.larghezza = ret.larghezza;
		}
		
		// calcolo soluzione
		System.out.println(ret.risulato());
		System.out.println(retmax.risulato() + " Questo rettangolo è piu grande");
		
		}
		scan.close();
	}

}
