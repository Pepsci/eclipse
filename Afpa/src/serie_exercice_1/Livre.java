package serie_exercice_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Livre {

		private String titre;
		private String auteur;
		private double prix;
		private static final AtomicInteger count = new AtomicInteger(0);
		private int LivreId;
		
		public Livre(String titre, String auteur, double prix) {
			super();
			this.LivreId = 0;
			this.titre = titre;
			this.auteur = auteur;
			this.prix = prix;
			LivreId = count.incrementAndGet(); 
		}
		
		public String getTitre() {
			return titre;
		}


		public void setTitre(String titre) {
			this.titre = titre;
		}


		public String getAuteur() {
			return auteur;
		}


		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}


		public double getPrix() {
			return prix;
		}


		public void setPrix(double prix) {
			this.prix = prix;
		}


		public static AtomicInteger getCount() {
			return count;
		}




		@Override
		public String toString() {
			return LivreId + " Le livre " + titre + " ecrit par " + auteur + " est au pris de " + prix + "€";
		}
		
		
		

		

		


	
		
		
		
		
		
}
