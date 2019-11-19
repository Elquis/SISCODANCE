package siscodance.edu.pe.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participante")
public class Criterios implements Serializable {
	
	private static final long serialVersionUID = 1L;
 	@Id
    @Column(name = "id_criterios")
    private Integer id_criterios;
    @Column(name = "nom_crit")
    private String nom_crit;
    @Column(name = "descr_crit")
    private String descr_crit;
    @Column(name = "punteje_min")
    private String puntaje_maxt;
    
    

	public Criterios(Integer id_criterios, String nom_crit, String descr_crit, String puntaje_maxt) {
		super();
		this.id_criterios = id_criterios;
		this.nom_crit = nom_crit;
		this.descr_crit = descr_crit;
		this.puntaje_maxt = puntaje_maxt;
	}



	public Integer getId_criterios() {
		return id_criterios;
	}



	public void setId_criterios(Integer id_criterios) {
		this.id_criterios = id_criterios;
	}



	public String getNom_crit() {
		return nom_crit;
	}



	public void setNom_crit(String nom_crit) {
		this.nom_crit = nom_crit;
	}



	public String getDescr_crit() {
		return descr_crit;
	}



	public void setDescr_crit(String descr_crit) {
		this.descr_crit = descr_crit;
	}



	public String getPuntaje_maxt() {
		return puntaje_maxt;
	}



	public void setPuntaje_maxt(String puntaje_maxt) {
		this.puntaje_maxt = puntaje_maxt;
	}



	public Criterios() {
	
	}

}
