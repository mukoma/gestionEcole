package gestionInscription3.entity;

public class Eleve extends Personne{

	private int idEle;

	public Eleve(String nom, String postnom, String nat, String lieuNais, String dateNai, String nomP, String nomM,
			String prenom, char genre,int idEle) {
		super(nom, postnom, nat, lieuNais, dateNai, nomP, nomM,prenom, genre);
		this.idEle = idEle;
	}

	public Eleve(String nom, String postnom, String nat, String lieuNais, String dateNai, String nomP, String nomM, String prenom, char genre) {
		super(nom, postnom, nat, lieuNais, dateNai, nomP, nomM, prenom, genre);
	}

	public Eleve() {
		// TODO Auto-generated constructor stub
	}

	public int getIdEle() {
		return idEle;
	}

	public void setIdEle(int idEle) {
		this.idEle = idEle;
	}
	
	
}
