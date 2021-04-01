package exercices;

import java.util.Iterator;

public class Exercice1 {

	public static void main(String[] args) {
		
		//exo 1
		System.out.println("Exercice 1 Année Bissextille");
		
		int annee = 2017;
		
		if(annee % 4 == 0 && annee % 100 != 0 || annee % 400 ==0) {
			System.out.println(annee + " Année Bissextille");

		}else {
			System.out.println("L'année "+ annee + " n'est pas bissextille");
		}

		// exo 2
		System.out.println("Exercice 2 Nombre premier");
		
		int nombrePremier = 18;
		int divisible = 0;
		if (nombrePremier >= 0 && nombrePremier <= 100) {
		}
					//		2			5
		for(var index = 2; index < nombrePremier; index++){
			if (nombrePremier % index == 0 ) {
				System.out.println(nombrePremier + " n'est pas premier");
				divisible =1;
				break;
			}
		}
		if (divisible == 0) {
			System.out.println(nombrePremier + " est premier");
		}

		int a= 5;
		int b = 8;
		
		addition(a, b);
		soustraction(a, b);
		multiplication(a, b);
		modulo(a, b);
		division(a, b);
		System.out.println(soustraction(15,5));
		System.out.println(addition(15,5));
		System.out.println(multiplication(15,5));
		System.out.println(modulo(15,5));
		System.out.println(division(15,5));
		System.out.println("la surface est de " + CalculMetreCarre(15, 3)+ " metre carré");
		// autre methode de calcule
		System.out.println(addition2(5,75));
		System.out.println(addition2(5,75,654,4));
		System.out.println(addition2(5,75,10));

	}
	
	public static int soustraction(int a, int b) {
		return a-b;	
	}
	
	public static int multiplication(int a, int b) {
		return a*b;	
	}
	
	public static int modulo(int a, int b) {
		return a%b;	
	}
	
	public static int division(int a, int b) {
		return a/b;	
	}
	
	public static int addition(int a, int b) {
		return a+b;	
	}
	
	
	public static int CalculMetreCarre(int longueur, int largeur) {
		int surface = longueur * largeur;
		return longueur*largeur;
	}
	
	public static int addition2(int ...nombre) {
		int resultat = 0;
		for (int i = 0; i < nombre.length; i++) {
		//	System.out.print("--"+nombre[i]+"--");
			resultat += nombre[i];
		}
		return resultat;
	}
	
}


