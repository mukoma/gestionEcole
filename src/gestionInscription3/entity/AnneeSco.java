package gestionInscription3.entity;

import java.util.Date;

public class AnneeSco {

	private int idAn;
	private Date anneeSco;
	
	public AnneeSco(int idAn, Date anneeSco) {
		super();
		this.idAn = idAn;
		this.anneeSco = anneeSco;
	}

	public AnneeSco(Date anneeSco) {
		super();
		this.anneeSco = anneeSco;
	}

	public int getIdAn() {
		return idAn;
	}

	public void setIdAn(int idAn) {
		this.idAn = idAn;
	}

	public Date getAnneeSco() {
		return anneeSco;
	}

	public void setAnneeSco(Date anneeSco) {
		this.anneeSco = anneeSco;
	}
	
	
	
}
