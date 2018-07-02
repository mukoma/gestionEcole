package gestionInscription3;

import java.sql.SQLException;

import gestionInscription3.dbconnection.ConnectBdd;
import gestionInscription3.dbconnection.maEntity.EleveMa;
import gestionInscription3.dbconnection.maEntity.InterfaceRepository;
import gestionInscription3.entity.Eleve;
import gestionInscription3.gui.Fenetre;

public class AppGestion {

	public static void main(String[] args) throws SQLException {
		
		/*
		Eleve el = new Eleve();
		el.setDateNai("1999-08-12");
		el.setIdEle(6);
		el.setGenre('M');
		el.setLieuNais("likasi");
		el.setNat("congolaise");
		el.setNom("kasongo");
		el.setPostnom("kanangila");
		el.setPrenom("gali");
		el.setNomM("kifita");
		el.setNomP("munsense");
		*/
		
		/*InterfaceRepository<Eleve> elma = new EleveMa();
	    //elma.create(el);
		
		
		elma.findAll().stream().forEach(Ele->{
			
			System.out.println(Ele.getNom());
			System.out.println(Ele.getPostnom());
			System.out.println(Ele.getIdEle());
		});*/
		
		Fenetre fen = new Fenetre();
		fen.setVisible(true);
		
	}

}
