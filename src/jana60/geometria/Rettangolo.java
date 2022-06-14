package jana60.geometria;

public class Rettangolo {

	//attributi
	int altezza;
	int larghezza;
	
	//metodi
	
	int area () {
		
		return larghezza * altezza;
	}
	
	int perimetro () {
		
		return (larghezza + altezza) * 2;
	}
	
	String risulato() {
		
		return "l'area del rettangolo è: " + area() + " il perimetro del rettangolo è:" + perimetro();
	}
}
