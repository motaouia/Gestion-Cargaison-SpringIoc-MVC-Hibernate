package org.gestiontransport.pckage.dao;

import java.util.List;

import org.gestiontransport.pckage.entities.Cargaison;
import org.gestiontransport.pckage.entities.Marchandise;

public interface ITransportDao {
	
	public Cargaison addCargaison(Cargaison cargaison);
	public Marchandise addMarchandisetoCargaison(Marchandise marchandise, String referenceCargaison);
	public List<Cargaison> listAllCargaison();
	public List<Cargaison> listAllMarchandises(String referenceCargaison);
	public List<Cargaison> listAllMarchandisesByMc(String motCle);
	public Cargaison getCargaison(String referenceCargaison);
	public boolean removeMarchandise(Long numMarchandise);

}