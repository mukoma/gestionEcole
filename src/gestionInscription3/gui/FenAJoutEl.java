package gestionInscription3.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gestionInscription3.dbconnection.maEntity.EleveMa;
import gestionInscription3.entity.Eleve;

public class FenAJoutEl extends JDialog {

	private JTextField zoneIdEl;
	private JTextField zoneNomEl;
	private JTextField zonePostNomEl;

	private JLabel labelNomEl;
	private JLabel labelPostNomEl;

	private JButton btnAnnuler;
	private JButton btnValider;

	public FenAJoutEl() {

		this.setSize(700, 500);
		this.setLocation(200, 200);

		zoneIdEl = new JTextField();
		zoneNomEl = new JTextField();
		zonePostNomEl = new JTextField();

		labelNomEl = new JLabel("Nom");
		labelPostNomEl = new JLabel("Postnom");

		btnAnnuler = new JButton("Annuler");
		btnValider = new JButton("Valider");

		this.setLayout(null);
		this.getContentPane().add(labelNomEl);
		labelNomEl.setBounds(10, 10, 100, 30);

		this.getContentPane().add(zoneNomEl);
		zoneNomEl.setBounds(90, 10, 200, 30);

		this.getContentPane().add(labelPostNomEl);
		labelPostNomEl.setBounds(10, 70, 100, 30);

		this.getContentPane().add(zonePostNomEl);
		zonePostNomEl.setBounds(90, 70, 200, 30);
		
		this.getContentPane().add(zoneIdEl);
		zoneIdEl.setBounds(300, 10, 100, 30);

		this.getContentPane().add(btnValider);
		btnValider.setBounds(10, 120, 100, 30);

		this.getContentPane().add(btnAnnuler);
		btnAnnuler.setBounds(150, 120, 100, 30);
		
		btnAnnuler.addActionListener(btnAnnulerList);
		btnValider.addActionListener(btnValiderList);

	}
	
	public void close(Fenetre fen) throws SQLException {
		//this.setVisible(b);
		fen.updateTEst();
	}

	private ActionListener btnValiderList = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			
			Eleve ele = new Eleve();
			ele.setNom(zoneNomEl.getText());
			ele.setPostnom(zonePostNomEl.getText());
			
			ele.setDateNai("1999-08-12");
			ele.setIdEle(Integer.valueOf(zoneIdEl.getText()));
			ele.setGenre('M');
			ele.setLieuNais("likasi");
			ele.setNat("congolaise");
			ele.setPrenom("gali");
			ele.setNomM("kifita");
			ele.setNomP("munsense");
			

			EleveMa elma = new EleveMa();
			try {

				elma.create(ele);
				
				setVisible(false);

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	};

	private ActionListener btnAnnulerList = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);

		}
	};

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}

}
