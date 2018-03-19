package zkx.hmy.wrj.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import zkx.hmy.wrj.model.Employe;
import zkx.hmy.wrj.model.Meuble;

public class EmployeController {
	private EntityManager em;
	private EntityTransaction tx;
	public EmployeController(){
		em=ConnectionClasse.getEntityManager();
		tx=em.getTransaction();
	}
	
	public void addEmploye(Employe employe){
		//System.out.println(employe.getNom());
		tx.begin();
		em.persist(employe);
		tx.commit();
		//em.close();
	}
	
	public List getEmployeList(){
		String queryStr = "select employe.IDEmploye, employe.heureDeTravail, employe.nom, employe.numeroTelephone, employe.prenom from Employe employe";
		Query query = em.createQuery(queryStr);
		List result = query.getResultList();
		return result;
	}
	
	public void updateEmploye(int idemploye,String nomString,String prenomString,int heureInt,String telString){
		Employe newEmploye = em.find(Employe.class,idemploye);
		//System.out.println(newProduction.getIDProduction());
		newEmploye.setHeureDeTravail(heureInt);
		newEmploye.setNom(nomString);
		newEmploye.setPrenom(prenomString);
		newEmploye.setNumeroTelephone(telString);
		tx.begin();
		em.merge(newEmploye);
		tx.commit();
	}
}
