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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Meuble")
public class Meuble {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDMeuble;
	private String type;
	private String materiels;
	private int tempsParLot;
	@ManyToMany
	@JoinTable(name="MEUBLE_EMPLOYE",
     joinColumns={@JoinColumn(name="MEUBLE_ID",
          referencedColumnName="IDMeuble")},
     inverseJoinColumns={@JoinColumn(name="EMPLOYE_ID",
          referencedColumnName="IDEmploye")})
	private List<Employe> employeList;
	@ManyToMany(mappedBy="meubleList")
	private List<Production> productionList;
	public int getIDMeuble() {
		return IDMeuble;
	}
	public void setIDMeuble(int iDMeuble) {
		IDMeuble = iDMeuble;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMateriels() {
		return materiels;
	}
	public void setMateriels(String materiels) {
		this.materiels = materiels;
	}
	public int getTempsParLot() {
		return tempsParLot;
	}
	public void setTempsParLot(int tempsParLot) {
		this.tempsParLot = tempsParLot;
	}
	public List<Employe> getEmployeList() {
		return employeList;
	}
	public void setEmployeList(List<Employe> employeList) {
		this.employeList = employeList;
	}
	public List<Production> getProduction() {
		return productionList;
	}
	public void setProduction(List<Production> productionList) {
		this.productionList=productionList;
	}
	
	
}
