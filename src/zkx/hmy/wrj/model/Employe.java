package zkx.hmy.wrj.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employe")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDEmploye;
	private int heureDeTravail;
	private String nom;
	private String prenom;
	private String numeroTelephone;
	@ManyToMany(mappedBy="employeList")
	private List<Meuble> meubleList;
	public int getIDEmploye() {
		return IDEmploye;
	}
	public void setIDEmploye(int iDEmploye) {
		IDEmploye = iDEmploye;
	}
	public int getHeureDeTravail() {
		return heureDeTravail;
	}
	public void setHeureDeTravail(int heureDeTravail) {
		this.heureDeTravail = heureDeTravail;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public List<Meuble> getMeuble() {
		return meubleList;
	}
	public void setMeuble(List<Meuble> meubleList) {
		this.meubleList=meubleList;
	}
	
	
}
