package gestionInscription3.entity;

public class Option {

	private int numOp;
	private String nomOp;
	private Classe classe;
	
	public Option(int numOp, String nomOp, Classe classe) {
		super();
		this.numOp = numOp;
		this.nomOp = nomOp;
		this.classe = classe;
	}

	public Option(String nomOp, Classe classe) {
		super();
		this.nomOp = nomOp;
		this.classe = classe;
	}

	public Option() {
		super();
	}

	public int getNumOp() {
		return numOp;
	}

	public void setNumOp(int numOp) {
		this.numOp = numOp;
	}

	public String getNomOp() {
		return nomOp;
	}

	public void setNomOp(String nomOp) {
		this.nomOp = nomOp;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	
	

	
	
}
