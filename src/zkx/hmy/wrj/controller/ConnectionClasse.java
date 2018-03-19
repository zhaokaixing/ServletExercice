package zkx.hmy.wrj.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionClasse {
	public static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("meubleproduction");
	public static final EntityManager MANAGER = FACTORY.createEntityManager();
	public static EntityManager getEntityManager() {
		return MANAGER;
	}
}
