package gestionInscription3.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import gestionInscription3.dbconnection.maEntity.EleveMa;

public class Fenetre extends JFrame implements ActionListener {

	private JMenu menu;
	private JMenuBar menuBar;
	private JMenuItem menuItemOuvrir;
	private JMenuItem menuItemAddEleve;
	private JMenuItem menuItemFermer;
	
	private JTable tableEleves;
	
	public Fenetre() throws SQLException {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Gestion Ecole");
		this.setSize(1300, 700);
		
		menuItemOuvrir = new JMenuItem("Ouvrir");
		menuBar = new JMenuBar();
	    menu = new JMenu("Fichier");
		
	    menuBar.add(menu);
	    menu.add(menuItemOuvrir);
	    
	    menuItemFermer = new JMenuItem("Fermer");
	   
	    menu.add(menuItemFermer);
	    
	    menuItemAddEleve = new  JMenuItem("AJOUT ELEVE");
	    menu.add(menuItemAddEleve);
	    
	    menuItemAddEleve.addActionListener(this);
	    
	    this.setLayout(null);
	    this.getContentPane().add(menuBar);
	    menuBar.setBounds(0, 0,1300, 30);
	    
	    
	    updateTEst();
	  
	    
	   
	    
	    this.getContentPane().add(tableEleves);
	    tableEleves.setBounds(70, 70, 800, 400);
	}
	public void updateTEst() throws SQLException{
		
		 EleveMa elma = new EleveMa();
		    
		    
		    Vector<String>colonne = new Vector<>();
		    colonne.add("nom");
		    colonne.add("postnom");
		    colonne.add("postnom");
		    
		    tableEleves = new JTable(elma.findAllVector(),colonne);  
		    TableColumnModel columnModel = tableEleves.getColumnModel();
		   // tableEleves.setd
		    columnModel.getColumn(0).setWidth(100);
		    columnModel.getColumn(1).setPreferredWidth(150);
	}
	
	private TableModel getTableModelEleve() {

		
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("okk");
		FenAJoutEl fenAJoutEl = new FenAJoutEl();
		fenAJoutEl.setVisible(true);
		try {
			fenAJoutEl.close(this);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
