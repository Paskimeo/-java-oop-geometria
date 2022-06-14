package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// aggiunto scanner e rettangolo
		Scanner scan = new Scanner(System.in);
		Rettangolo ret = new Rettangolo();
	
		
		//richiesta altezza e larghezza
		System.out.println("inserisci l'altezza del rettangolo:");
		ret.altezza= Integer.parseInt(scan.nextLine());

		System.out.println("inserisci la larghezza del rettangolo:");
		ret.larghezza= Integer.parseInt(scan.nextLine());
		
		System.out.println(ret.risulato());
		scan.close();
	}

}
