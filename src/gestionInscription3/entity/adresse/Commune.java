package gestionInscription3.entity.adresse;

public class Commune {

	private int idCom;
	private String nom;
	private Ville ville;
	
	public Commune(int idCom, String nom, Ville ville) {
		super();
		this.idCom = idCom;
		this.nom = nom;
		this.ville = ville;
	}

	public Commune(String nom, Ville ville) {
		super();
		this.nom = nom;
		this.ville = ville;
	}

	public int getIdCom() {
		return idCom;
	}

	public void setIdCom(int idCom) {
		this.idCom = idCom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
	
	
}
