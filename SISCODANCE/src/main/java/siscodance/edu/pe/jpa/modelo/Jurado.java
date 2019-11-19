package siscodance.edu.pe.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jurado")

public class Jurado implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	    @Id
	    @Column(name = "id_juardo")
	    private Integer id_jurado;
	    @Column(name = "nom_jurado")
	    private String nom_jurado;
	    @Column(name = "apep_jurado")
	    private String apep_jurado;
	    @Column(name = "apem_jurado")
	    private String apem_jurado;
	    @Column(name = "dni")
	    private Float dni;
	  

	public Jurado(Integer id_jurado, String nom_jurado, String apep_jurado, String apem_jurado, Float dni) {
			super();
			this.id_jurado = id_jurado;
			this.nom_jurado = nom_jurado;
			this.apep_jurado = apep_jurado;
			this.apem_jurado = apem_jurado;
			this.dni = dni;
		}


	public Integer getId_jurado() {
			return id_jurado;
		}


		public void setId_jurado(Integer id_jurado) {
			this.id_jurado = id_jurado;
		}


		public String getNom_jurado() {
			return nom_jurado;
		}


		public void setNom_jurado(String nom_jurado) {
			this.nom_jurado = nom_jurado;
		}


		public String getApep_jurado() {
			return apep_jurado;
		}


		public void setApep_jurado(String apep_jurado) {
			this.apep_jurado = apep_jurado;
		}


		public String getApem_jurado() {
			return apem_jurado;
		}


		public void setApem_jurado(String apem_jurado) {
			this.apem_jurado = apem_jurado;
		}


		public Float getDni() {
			return dni;
		}


		public void setDni(Float dni) {
			this.dni = dni;
		}


	public Jurado() {
		
	}

}
