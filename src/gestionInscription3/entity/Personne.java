package gestionInscription3.entity;

public abstract class Personne {

	private String nom;
	private String postnom;
	private String prenom;
	private String nat;
	private String lieuNais;
	private String dateNai;
	private String nomP;
	private String nomM;
	private char genre;
	
	public Personne(String nom, String postnom, String nat, String lieuNais, String dateNai, String nomP, String nomM,String prenom,char genre) {
		super();
		this.nom = nom;
		this.postnom = postnom;
		this.nat = nat;
		this.lieuNais = lieuNais;
		this.dateNai = dateNai;
		this.nomP = nomP;
		this.nomM = nomM;
		this.prenom = prenom;
		this.genre = genre;
	}

	public Personne() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPostnom() {
		return postnom;
	}

	public void setPostnom(String postnom) {
		this.postnom = postnom;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	public String getLieuNais() {
		return lieuNais;
	}

	public void setLieuNais(String lieuNais) {
		this.lieuNais = lieuNais;
	}

	public String getDateNai() {
		return dateNai;
	}

	public void setDateNai(String dateNai) {
		this.dateNai = dateNai;
	}

	public String getNomP() {
		return nomP;
	}

	public void setNomP(String nomP) {
		this.nomP = nomP;
	}

	public String getNomM() {
		return nomM;
	}

	public void setNomM(String nomM) {
		this.nomM = nomM;
	}

	public char getGenre() {
		return genre;
	}

	public void setGenre(char genre) {
		this.genre = genre;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	
}
