package zkx.hmy.wrj.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Production")
public class Production {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDProduction;
	private int nombreJours;
	private String dateDebut;
	private String dateFin;
	@ManyToMany
	@JoinTable(name="PRODUCTION_MEUBLE",
     joinColumns={@JoinColumn(name="PRODUCTION_ID",
          referencedColumnName="IDproduction")},
     inverseJoinColumns={@JoinColumn(name="MEUBLE_ID",
          referencedColumnName="IDMeuble")})

	private List<Meuble> meubleList;
	public int getIDProduction() {
		return IDProduction;
	}
	public void setIDProduction(int iDProduction) {
		IDProduction = iDProduction;
	}
	public int getNombreJours() {
		return nombreJours;
	}
	public void setNombreJours(int nombreJours) {
		this.nombreJours = nombreJours;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public List<Meuble> getMeubleList() {
		return meubleList;
	}
	public void setMeubleList(List<Meuble> meubleList) {
		this.meubleList = meubleList;
	}
	
}
