package gestionInscription3.entity;

public class Classe {
  
	private int numClass;
	private String nomCl;
	private int capacite;
	private Ecole ecole;
	
	public Classe(int numClass, String nomCl, int capacite, Ecole ecole) {
		super();
		this.numClass = numClass;
		this.nomCl = nomCl;
		this.capacite = capacite;
		this.ecole = ecole;
	}

	public Classe(String nomCl, int capacite, Ecole ecole) {
		super();
		this.nomCl = nomCl;
		this.capacite = capacite;
		this.ecole = ecole;
	}

	public Classe() {
		super();
	}

	public int getNumClass() {
		return numClass;
	}

	public void setNumClass(int numClass) {
		this.numClass = numClass;
	}

	public String getNomCl() {
		return nomCl;
	}

	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}
	
	
	
	
}
