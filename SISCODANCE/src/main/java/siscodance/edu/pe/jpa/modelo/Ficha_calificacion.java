package siscodance.edu.pe.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ficha_calificacion")
public class Ficha_calificacion implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	    @Id
	    @Column(name = "id_fichacal")
	    private Integer id_fichacal;
	    @Column(name = "calificacion")
	    private Integer calificacion;
	    @Column(name = "observacion")
	    private String observacion;
	    

	public Ficha_calificacion(Integer id_fichacal, Integer calificacion, String observacion) {
			super();
			this.id_fichacal = id_fichacal;
			this.calificacion = calificacion;
			this.observacion = observacion;
		}


	public Integer getId_fichacal() {
			return id_fichacal;
		}


		public void setId_fichacal(Integer id_fichacal) {
			this.id_fichacal = id_fichacal;
		}


		public Integer getCalificacion() {
			return calificacion;
		}


		public void setCalificacion(Integer calificacion) {
			this.calificacion = calificacion;
		}


		public String getObservacion() {
			return observacion;
		}


		public void setObservacion(String observacion) {
			this.observacion = observacion;
		}


	public Ficha_calificacion() {
		
	}

}
