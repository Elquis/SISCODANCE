package siscodance.edu.pe.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participante")
public class Participante implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @Basic(optional = false)
    @Column(name = "id_inscrip")
    private Integer id_inscrip;
    @Column(name = "nom_danza")
    private String nom_danza;
    @Column(name = "fecha_hora")
    private String fecha_hora;
   

	public Participante(Integer id_inscrip, String nom_danza, String fecha_hora) {
		super();
		this.id_inscrip = id_inscrip;
		this.nom_danza = nom_danza;
		this.fecha_hora = fecha_hora;
	}


	public Integer getId_inscrip() {
		return id_inscrip;
	}


	public void setId_inscrip(Integer id_inscrip) {
		this.id_inscrip = id_inscrip;
	}


	public String getNom_danza() {
		return nom_danza;
	}


	public void setNom_danza(String nom_danza) {
		this.nom_danza = nom_danza;
	}


	public String getFecha_hora() {
		return fecha_hora;
	}


	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}


	public Participante() {
		
	}

}
