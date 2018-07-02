package gestionInscription3.entity.adresse;

public class Quatier {

	private int numAd;
	private String nom;
	private Commune commune;
	
	public Quatier(int numAd, String nom, Commune commune) {
		super();
		this.numAd = numAd;
		this.nom = nom;
		this.commune = commune;
	}

	public Quatier(String nom, Commune commune) {
		super();
		this.nom = nom;
		this.commune = commune;
	}

	public int getNumAd() {
		return numAd;
	}

	public void setNumAd(int numAd) {
		this.numAd = numAd;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Commune getCommune() {
		return commune;
	}

	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	
	
	
}
