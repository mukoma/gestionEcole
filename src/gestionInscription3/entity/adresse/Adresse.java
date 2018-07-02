package gestionInscription3.entity.adresse;

public class Adresse {
	
	private int numAd;
	private Avenue avenue;
	
	public Adresse(int numAd, Avenue avenue) {
		this.numAd = numAd;
		this.avenue = avenue;
	}
	
	public Adresse(Avenue avenue) {
		this.avenue = avenue;
	}
	
	public Adresse() {
		
	}
	
	public int getNumAd() {
		return this.numAd;
	}
	
	public Avenue getAvenue() {
		return this.avenue;
	}
	
	public void setNumAd(int numAd) {
		this.numAd = numAd;
	}
	
	public void setAvenue(Avenue avenue) {
		this.avenue = avenue;
	}

}
