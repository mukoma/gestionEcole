package gestionInscription3.dbconnection.maEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gestionInscription3.dbconnection.ConnectBdd;
import gestionInscription3.entity.Eleve;

public class EleveMa {

	public boolean insertEleve(Eleve eleve) throws SQLException {
		
		Statement statement = ConnectBdd.getConnection().createStatement();
		
		
		boolean test = statement.execute("insert into eleve (num_eleve,nom_eleve,post_nom_eleve,prenom_eleve,genre_eleve,nationalite,lieu_naissance,date_naissance,nom_pere,nom_mere) values('"+eleve.getIdEle()+"',"
				+ "'"+eleve.getNom()+"','"+eleve.getPostnom()+"','"+eleve.getPrenom()+"','"+eleve.getGenre()+"','"+eleve.getNat()+"','"+eleve.getLieuNais()+"','"+eleve.getDateNai()+"','"+eleve.getNomP()+"','"+eleve.getNomM()+"')");
		
		return test;
	}
	
	public void afficherEleve() throws SQLException {
		
		Statement statement = ConnectBdd.getConnection().createStatement();
		
		ResultSet res = statement.executeQuery("select*from eleve");
		
		while (res.next()) {
			
			System.out.println(res.getString("num_eleve"));
			System.out.println(res.getString("nom_eleve"));
			
		}
		
	}
}
