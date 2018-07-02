package gestionInscription3.entity.adresse;

public class Avenue {

	private int idAv;
	private String nomAv;
	private Quatier quartier;
	
	public Avenue() {
		// TODO Auto-generated constructor stub
	}
	
	public Avenue(int idAv, String nomAv, Quatier quatier) {
		this.idAv = idAv;
		this.nomAv = nomAv;
		this.quartier = quatier;
	}
	
	public Avenue(String nomAv, Quatier quatier) {
		this.nomAv = nomAv;
		this.quartier = quatier;
	}
	
	public int getIdAv() {
		return this.idAv;
	}
	
	public String getNomAv() {
		return this.nomAv;
	}
	
	public Quatier getQuartier() {
		return this.quartier;
	}
	
	public void setIdAv(int idAv) {
		this.idAv = idAv;
	}
	public void setNom(String nomAv) {
		this.nomAv = nomAv;
	}
	
	public void setQuartier(Quatier quatier) {
		this.quartier = quatier;
	}
	
	
}
