package org.gestiontransport.pckage.metier;

import java.util.List;

import org.gestiontransport.pckage.dao.ITransportDao;
import org.gestiontransport.pckage.entities.Cargaison;
import org.gestiontransport.pckage.entities.Marchandise;

public class TransportMetierImpl implements ITransportMetier {
	
	
	private ITransportDao dao;

	public Cargaison addCargaison(Cargaison cargaison) {
		return dao.addCargaison(cargaison);
	}

	public Marchandise addMarchandisetoCargaison(Marchandise marchandise, String referenceCargaison) {
		return dao.addMarchandisetoCargaison(marchandise, referenceCargaison);
	}

	public List<Cargaison> listAllCargaison() {
		return dao.listAllCargaison();
	}

	public List<Cargaison> listAllMarchandises(String referenceCargaison) {
		return dao.listAllMarchandises(referenceCargaison);
	}

	public List<Cargaison> listAllMarchandisesByMc(String motCle) {
		return dao.listAllMarchandisesByMc(motCle);
	}

	public Cargaison getCargaison(String referenceCargaison) {
		return dao.getCargaison(referenceCargaison);
	}

	public boolean removeMarchandise(Long numMarchandise) {
		return dao.removeMarchandise(numMarchandise);
	}

	public ITransportDao getDao() {
		return dao;
	}

	public void setDao(ITransportDao dao) {
		this.dao = dao;
	}
	
}