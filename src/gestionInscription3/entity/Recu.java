package gestionInscription3.entity;

import java.util.Date;

public class Recu {

	private int numRec;
	private String motif;
	private double montant;
	private Date date;
	private Agent agent;
	private Eleve eleve;
	private AnneeSco anneeSco;
	
	public Recu(int numRec, String motif, double montant, Date date, Agent agent, Eleve eleve, AnneeSco anneeSco) {
		super();
		this.numRec = numRec;
		this.motif = motif;
		this.montant = montant;
		this.date = date;
		this.agent = agent;
		this.eleve = eleve;
		this.anneeSco = anneeSco;
	}

	public Recu(String motif, double montant, Date date, Agent agent, Eleve eleve, AnneeSco anneeSco) {
		super();
		this.motif = motif;
		this.montant = montant;
		this.date = date;
		this.agent = agent;
		this.eleve = eleve;
		this.anneeSco = anneeSco;
	}

	public int getNumRec() {
		return numRec;
	}

	public void setNumRec(int numRec) {
		this.numRec = numRec;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	public AnneeSco getAnneeSco() {
		return anneeSco;
	}

	public void setAnneeSco(AnneeSco anneeSco) {
		this.anneeSco = anneeSco;
	}
	
	
	
	
}
