package org.gestiontransport.pckage.dao;

import java.util.List;

import org.gestiontransport.pckage.entities.Cargaison;
import org.gestiontransport.pckage.entities.Marchandise;
import org.gestiontransport.pckage.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
public class TransportDaoImpl implements ITransportDao {
	
	@Override
	public Cargaison addCargaison(Cargaison cargaison) {
		Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(cargaison);
            // commit transaction
            transaction.commit();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
			transaction = null;
		}
        
		return cargaison;
	}

	@Override
	public Marchandise addMarchandisetoCargaison(Marchandise marchandise, String referenceCargaison) {
		Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
        	
            // start a transaction
            transaction = session.beginTransaction();
            
            // save the student object
            Cargaison cargaison = session.get(Cargaison.class, referenceCargaison);
            
            if(cargaison != null && marchandise != null){
            	
            	marchandise.setCargaison(cargaison);
            	cargaison.getMarchanides().add(marchandise);
            	session.save(marchandise);
            	
            	// commit transaction
                transaction.commit();
            }else{
            	
            	throw new RuntimeException("Somethins is Wrong");
            }
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		return marchandise;
	}

	@Override
	public List<Cargaison> listAllCargaison() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("from Cargaison", Cargaison.class).list();
        }
	}

	@Override
	public List<Cargaison> listAllMarchandises(String referenceCargaison) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("from Marchandise m where m.cargaison.referenceCargaison=:x", Cargaison.class).setParameter("x", referenceCargaison).list();
        }
	}

	@Override
	public List<Cargaison> listAllMarchandisesByMc(String motCle) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("from Marchandise m where m.nomMarchandise like x", Cargaison.class).setParameter("x", "%"+motCle+"%").list();
        }
	}

	@Override
	public Cargaison getCargaison(String referenceCargaison) {
		return HibernateUtils.getSessionFactory().getCurrentSession().get(Cargaison.class, referenceCargaison);
	}

	@Override
	public boolean removeMarchandise(Long numMarchandise) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			Marchandise marchandise = session.byId(Marchandise.class).load(numMarchandise);
		      session.delete(marchandise);
		      return true;
		}catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	}

}
