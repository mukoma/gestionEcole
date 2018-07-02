package gestionInscription3.entity.adresse;

public class Ville {

	private int numVille;
	private String nom;
	
	public Ville(int numVille, String nom) {
		super();
		this.numVille = numVille;
		this.nom = nom;
	}

	public Ville(String nom) {
		super();
		this.nom = nom;
	}

	public int getNumVille() {
		return numVille;
	}

	public void setNumVille(int numVille) {
		this.numVille = numVille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	
	
}
