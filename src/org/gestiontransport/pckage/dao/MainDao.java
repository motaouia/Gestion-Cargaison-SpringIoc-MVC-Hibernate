package org.gestiontransport.pckage.dao;

import java.util.Date;

import org.gestiontransport.pckage.entities.CargaisonAerienne;
import org.gestiontransport.pckage.entities.CargaisonRoutiere;
import org.gestiontransport.pckage.entities.Marchandise;

public class MainDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITransportDao dao = new TransportDaoImpl();
		//dao.addCargaison(new CargaisonAerienne("Ref_CarAer_I", 450.90, new Date(), null, 1400.80));
		//dao.addCargaison(new CargaisonAerienne("Ref_CarAer_II", 450.90, new Date(), null, 1400.80));
		
		//dao.addCargaison(new CargaisonRoutiere("Ref_CarRout_II", 450.90, new Date(), null, 1400.00));
		//dao.addCargaison(new CargaisonRoutiere("Ref_CarRout_III", 450.90, new Date(), null, 580.00));
		
		//dao.addMarchandisetoCargaison(new Marchandise("Ordinateurs PC", 200, 400), "Ref_CarAer_I");
		//dao.addMarchandisetoCargaison(new Marchandise("Smart Phone Samsung", 80, 250), "Ref_CarAer_I");
		//dao.addMarchandisetoCargaison(new Marchandise("TV LG", 400, 600), "Ref_CarRout_II");
		
		//dao.addMarchandisetoCargaison(new Marchandise("Ordinateurs Dell", 400, 560), "Ref_CarRout_II");
		//dao.addMarchandisetoCargaison(new Marchandise("Ordinateurs HP", 120, 320), "Ref_CarRout_II");
		
		//dao.addMarchandisetoCargaison(new Marchandise("Ecran Samsung", 890, 128), "Ref_CarRout_III");
		//dao.addMarchandisetoCargaison(new Marchandise("Imprimantes Simens", 490, 600), "Ref_CarRout_III");
		

	}

}
