package gestionInscription3.dbconnection.maEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import gestionInscription3.dbconnection.ConnectBdd;
import gestionInscription3.entity.Eleve;

public class EleveMa implements InterfaceRepository<Eleve> {


	@Override
	public Eleve create(Eleve a) throws SQLException {
		Statement statement = ConnectBdd.getConnection().createStatement();

	 statement.execute(
				"insert into eleve (num_eleve,nom_eleve,post_nom_eleve,prenom_eleve,genre_eleve,nationalite,lieu_naissance,date_naissance,nom_pere,nom_mere) values('"
						+ a.getIdEle() + "'," + "'" + a.getNom() + "','" + a.getPostnom() + "','" + a.getPrenom()
						+ "','" + a.getGenre() + "','" + a.getNat() + "','" + a.getLieuNais() + "','" + a.getDateNai()
						+ "','" + a.getNomP() + "','" + a.getNomM() + "')");
		return a;
	}

	@Override
	public void delete(Eleve a) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Eleve> findAll() throws SQLException {
		
		Statement statement = ConnectBdd.getConnection().createStatement();

		ResultSet res = statement.executeQuery("select*from eleve");
        List<Eleve> listeEL = new ArrayList<>();
        
		while (res.next()) {

		    Eleve el = new Eleve();
		    el.setDateNai(res.getString("date_naissance"));
		    el.setNat(res.getString("nationalite"));
		    el.setGenre(res.getString("genre_eleve").charAt(0));
		    el.setIdEle(res.getInt("num_eleve"));
		    el.setLieuNais(res.getString("lieu_naissance"));
		    el.setNom(res.getString("nom_eleve"));
		    el.setPostnom(res.getString("post_nom_eleve"));
		    el.setPrenom(res.getString("prenom_eleve"));
		    el.setNomM(res.getString("nom_mere"));
		    el.setNomP(res.getString("nom_pere"));
		    
		    listeEL.add(el);

		}
		return listeEL;
	}
	
	public Vector<Vector<String>> findAllVector() throws SQLException {
		
		Statement statement = ConnectBdd.getConnection().createStatement();

		ResultSet res = statement.executeQuery("select*from eleve");
        
		Vector<Vector<String>> donnee = new Vector<>();
        
		while (res.next()) {

			Vector<String> ligne = new Vector<>();
		    
			ligne.add(res.getString("nom_eleve"));
			ligne.add(res.getString("post_nom_eleve"));
			ligne.add(res.getString("prenom_eleve"));
			donnee.add(ligne);

		}
		return donnee;
	}

	@Override
	public Eleve findOne(Eleve a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Eleve a) {
		// TODO Auto-generated method stub
		return false;
	}
}
