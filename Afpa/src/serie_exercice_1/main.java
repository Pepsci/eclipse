package serie_exercice_1;

import java.util.Arrays;
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		
		Livre [] livres = new Livre[2];
		Scanner saisie = null;
		
		for (int i = 0; i < livres.length; i++) {
			saisie = new Scanner(System.in);
			System.out.println("Entrez le titre");
			String titre = saisie.next();
			System.out.println("Entrez l'auteur");
			String auteur = saisie.next();
			System.out.println("Entrez le prix");
			double prix = saisie.nextDouble();
			
			 livres[i] = new Livre(titre, auteur, prix);
			
		}
 		
		for (Livre livre : livres) {
			System.out.println(livres);

		}
		
System.out.println();
		
		Livre exemplaire1 = new Livre("Fondation","Isaac Asimov", 18);
		Livre exemplaire2 = new Livre("Le Marteau de Thor","Patrick Weber",25.7);
		Livre exemplaire3 = new Livre("Dune","Franck Herbert", 15);
		Livre exemplaire4 = new Livre("Blackout","Connie Willis",17.5);
		Livre exemplaire5 = new Livre("Le Maitre du Haut Chateau","Phillip K.Dick",21);
		
		System.out.println(exemplaire1);
		System.out.println(exemplaire2);
		System.out.println(exemplaire3);
		System.out.println(exemplaire4);
		System.out.println(exemplaire5);
	
System.out.println();

		
		Specialite [] specialites = new Specialite[10];
		specialites[1] = new Specialite(1, "JAVA/JEE");
		specialites[2] = new Specialite(2, "HTML/CSS");
		specialites[3] = new Specialite(3, "Gestion de projet");
		specialites[4] = new Specialite(4, "JS");
		specialites[5] = new Specialite(5, "PHP");
		

		
		Enseignant[] enseignants = new Enseignant[6];
		enseignants[1] = new Enseignant("Jean","Pierre","jp@jp.com",specialites[1]);
		enseignants[2] = new Enseignant("Joss","Fil","jf@jf.com",specialites[1]);
		enseignants[3] = new Enseignant("Camara","Moussa","CM@CM.com",specialites[3]);
		enseignants[4] = new Enseignant("belmondo","Paul","jp@jp.com",specialites[2]);
		
		for (Specialite specialite : specialites) {
			
		}		
	
		}
		

			}
		
			

	


