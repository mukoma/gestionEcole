package gestionInscription3.entity;

public class Document {

	private int idDoc;
	private String typeDoc;
	private Eleve eleve;
	
	public Document(int idDoc, String typeDoc, Eleve eleve) {
		super();
		this.idDoc = idDoc;
		this.typeDoc = typeDoc;
		this.eleve = eleve;
	}

	public Document(String typeDoc, Eleve eleve) {
		super();
		this.typeDoc = typeDoc;
		this.eleve = eleve;
	}

	public int getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	public String getTypeDoc() {
		return typeDoc;
	}

	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	
	
}
