package zkx.hmy.wrj.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import zkx.hmy.wrj.model.Utilisateur;

public class UtilisateurController {

	private EntityManager em;
	private EntityTransaction tx;
	public UtilisateurController(){
		em=ConnectionClasse.getEntityManager();
		tx=em.getTransaction();
		Utilisateur utilisteur= new Utilisateur();
		utilisteur.setNom("admin");
		utilisteur.setMdp("password");
		utilisteur.setRole("admin");
		tx.begin();
		em.persist(utilisteur);
		tx.commit();
	}
	public List getUtilisateurList(){
		String queryStr = "select u.IDUtilisateur, u.nom, u.mdp, u.role from Utilisateur u";
		Query query = em.createQuery(queryStr);
		List result = query.getResultList();
		return result;
	}
}
