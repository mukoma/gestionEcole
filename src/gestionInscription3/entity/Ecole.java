package gestionInscription3.entity;

import gestionInscription3.entity.adresse.Avenue;

public class Ecole {

	private int numEc;
	private String nomEc;
	private int capacite;
	private Avenue avenue;
	
	public Ecole(int numEc, String nomEc, int capacite, Avenue avenue) {
		super();
		this.numEc = numEc;
		this.nomEc = nomEc;
		this.capacite = capacite;
		this.avenue = avenue;
	}

	public Ecole(String nomEc, int capacite, Avenue avenue) {
		super();
		this.nomEc = nomEc;
		this.capacite = capacite;
		this.avenue = avenue;
	}

	public Ecole() {
		super();
	}

	public int getNumEc() {
		return numEc;
	}

	public void setNumEc(int numEc) {
		this.numEc = numEc;
	}

	public String getNomEc() {
		return nomEc;
	}

	public void setNomEc(String nomEc) {
		this.nomEc = nomEc;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Avenue getAvenue() {
		return avenue;
	}

	public void setAvenue(Avenue avenue) {
		this.avenue = avenue;
	}
	
	
	
}
