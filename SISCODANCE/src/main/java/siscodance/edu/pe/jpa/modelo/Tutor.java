package siscodance.edu.pe.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 	@Id
	    @Column(name = "tutor_id")
	    private Integer tutor_id;
	    @Column(name = "nom_tut")
	    private String nom_tut;
	    @Column(name = "apep_tut")
	    private String apep_tut;
	    @Column(name = "apem_tut")
	    private String apem_tut;
	    @Column(name = "dni")
	    private Float dni;

	public Tutor(Integer tutor_id, String nom_tut, String ape_tut, Float dni) {
			super();
			this.tutor_id = tutor_id;
			this.nom_tut = nom_tut;
			
			this.dni = dni;
		}

	public Tutor(String nom_tut, String apep_tut) {
		super();
		this.nom_tut = nom_tut;
		this.apep_tut = apep_tut;
	}

	public Integer getTutor_id() {
			return tutor_id;
		}

		public void setTutor_id(Integer tutor_id) {
			this.tutor_id = tutor_id;
		}

		public String getNom_tut() {
			return nom_tut;
		}

		public void setNom_tut(String nom_tut) {
			this.nom_tut = nom_tut;
		}

	
		public String getApep_tut() {
			return apep_tut;
		}

		public void setApep_tut(String apep_tut) {
			this.apep_tut = apep_tut;
		}

		public String getApem_tut() {
			return apem_tut;
		}

		public void setApem_tut(String apem_tut) {
			this.apem_tut = apem_tut;
		}

		public Float getDni() {
			return dni;
		}

		public void setDni(Float dni) {
			this.dni = dni;
		}

	public Tutor() {
		
	}

}
