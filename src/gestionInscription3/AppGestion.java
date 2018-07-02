package gestionInscription3;

import java.sql.SQLException;

import gestionInscription3.dbconnection.ConnectBdd;
import gestionInscription3.dbconnection.maEntity.EleveMa;
import gestionInscription3.entity.Eleve;

public class AppGestion {

	public static void main(String[] args) throws SQLException {
		
		Eleve el = new Eleve();
		el.setDateNai("1999-08-12");
		el.setIdEle(3);
		el.setGenre('M');
		el.setLieuNais("likasi");
		el.setNat("congolaise");
		el.setNom("kasongo");
		el.setPostnom("kanangila");
		el.setPrenom("gali");
		el.setNomM("kifita");
		el.setNomP("munsense");
		
		
		EleveMa elma = new EleveMa();
		boolean test = elma.insertEleve(el);
		
		

		System.out.println(test);
		
		elma.afficherEleve();
	}

}
