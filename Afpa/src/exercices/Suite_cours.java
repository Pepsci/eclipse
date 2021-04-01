package exercices;

import java.util.Scanner;


public class Suite_cours {

	public static void main(String[] args) {

		System.out.println("choisir un nombre");
		Scanner scanner =  new Scanner(System.in);
		
		int choix = scanner.nextInt();
		System.out.println("vous avez choisis "+ choix);
		
		// saisie année
		System.out.println("choisir une année");
		int annee = scanner.nextInt();
		
		if(annee % 4 == 0 && annee % 100 != 0 || annee % 400 ==0) {
			System.out.println(annee + " Année Bissextille");

		}else {
			System.out.println("L'année "+ annee + " n'est pas bissextille");
		}
		
		//Exo multiplication
		
		System.out.println("Entrez une longueur");
		double longueur = scanner.nextDouble();
		System.out.println("Entrez une largeur");
		double largeur = scanner.nextDouble();
		double surface = longueur * largeur;
		System.out.println("la surface est de "+surface+" metre carrée");
			
		System.out.println("Entrez une longueur "+" et une largeur");
		double longueur1 = scanner.nextDouble();
		double largeur2 = scanner.nextDouble();
		double surface2 = longueur1 * largeur2;
		System.out.println("la surface est de "+surface2+" metre carrée");
		
		
	}
}
