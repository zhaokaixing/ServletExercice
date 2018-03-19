package zkx.hmy.wrj.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import zkx.hmy.wrj.model.Employe;
import zkx.hmy.wrj.model.Meuble;
import zkx.hmy.wrj.model.Production;

public class MeubleController {

	private EntityManager em;
	private EntityTransaction tx;
	public MeubleController(){
		em=ConnectionClasse.getEntityManager();
		tx=em.getTransaction();
	}
	public void addMeuble(Meuble meuble){
		tx.begin();
		em.persist(meuble);
		tx.commit();
	}
	public List getMeubleList(){
		String queryStr = "select meuble.IDMeuble, meuble.materiels, meuble.tempsParLot, meuble.type from Meuble meuble";
		Query query = em.createQuery(queryStr);
		List result = query.getResultList();
		return result;
	}	
	public void updateMeuble(int idmeuble,String typeString,String materielString,List<Employe> employeList,int tempInteger){
		Meuble newMeuble = em.find(Meuble.class,idmeuble);
		//System.out.println(newProduction.getIDProduction());
		newMeuble.setEmployeList(employeList);
		newMeuble.setMateriels(materielString);
		newMeuble.setType(typeString);
		newMeuble.setTempsParLot(tempInteger);
		tx.begin();
		em.merge(newMeuble);
		tx.commit();
	}
}
