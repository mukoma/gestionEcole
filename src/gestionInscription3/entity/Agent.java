package gestionInscription3.entity;

public class Agent extends Personne {

	private int idAgent;
	private int matricule;
	private String fonction;
	private Ecole ecole;

	public Agent(int idAgent, String nom, String postnom, String nat, String lieuNais, String dateNai, String nomP,
			String nomM,String prenom, char genre, int matricule, String fonction, Ecole ecole) {

		super(nom, postnom, nat, lieuNais, dateNai, nomP, nomM,prenom,genre);
		this.idAgent = idAgent;
		this.matricule = matricule;
		this.fonction = fonction;
		this.ecole = ecole;
	}

	public Agent(String nom, String postnom, String nat, String lieuNais, String dateNai, String nomP, String nomM,
			String prenom, char genre,int matricule, String fonction, Ecole ecole) {

		super(nom, postnom, nat, lieuNais, dateNai, nomP, nomM,prenom,genre);
		
		this.matricule = matricule;
		this.fonction = fonction;
		this.ecole = ecole;
	}

	public int getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}
	
	

}
