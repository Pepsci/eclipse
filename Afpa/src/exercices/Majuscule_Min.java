package exercices;

import java.util.Scanner;

public class Majuscule_Min {
	
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Donner le nom cet étudiant :");
//        String nom = sc.next();
//        System.out.println("Donner le prénom cet étudiant :");
//        String prenom = sc.next();
//        System.out.println(">> " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + "" + prenom.substring(1).toLowerCase());
//  
        Scanner lecture = new Scanner(System.in);
      
	    System.out.print("Saisissez votre nom complet:");
		String nom1 = lecture.next();
		System.out.print("Quel est votre sexe M/F:");
		char sexe = lecture.next().charAt(0);
		switch (sexe) {
		case 'M': System.out.print("Bonjour Monsieur: "+nom1);
			
			break;
		case 'F':System.out.print("Bonjour Madame: "+nom1);
		    break;
	
		default:
			    System.out.print("Merci de saisir des données correctes");
			break;
		}
    
    }  
}
