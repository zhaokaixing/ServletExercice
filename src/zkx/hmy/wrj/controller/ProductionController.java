package zkx.hmy.wrj.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import zkx.hmy.wrj.model.Meuble;
import zkx.hmy.wrj.model.Production;

public class ProductionController {

	private EntityManager em;
	private EntityTransaction tx;
	
     
	
	public ProductionController(){
		em=ConnectionClasse.getEntityManager();
		tx=em.getTransaction();
	}
	public void addProduction(Production production){
		tx.begin();
		em.persist(production);
		tx.commit();
	}
	public List getProductionList(){
		String queryStr = "select pro.IDProduction, pro.nombreJours, pro.dateDebut, pro.dateFin from Production pro";
		Query query = em.createQuery(queryStr);
		List result = query.getResultList();
		return result;
	}	
	public void updateProduction(int idproduction,int nombreJoursInteger,String debutString,String finString
			,List<Meuble> meubleList){
		Production newProduction = em.find(Production.class,idproduction);
		System.out.println(newProduction.getIDProduction());
		newProduction.setNombreJours(nombreJoursInteger);
		newProduction.setDateDebut(debutString);
		newProduction.setDateFin(finString);
		newProduction.setMeubleList(meubleList);
		tx.begin();
		em.merge(newProduction);
		tx.commit();
	}
}
