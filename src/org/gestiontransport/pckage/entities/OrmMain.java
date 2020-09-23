package org.gestiontransport.pckage.entities;

import org.gestiontransport.pckage.utils.HibernateUtils;
import org.hibernate.Session;

public class OrmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Session session = HibernateUtils.getSessionFactory().openSession()	){
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
