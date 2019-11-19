package siscodance.edu.pe.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "secciones")
public class Secciones implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @Column(name = "id_aula")
	    private Integer id_aula;
	    @Column(name = "nivel")
	    private String nivel;
	    @Column(name = "grado")
	    private String grado;
	    @Column(name = "seccion")
	    private String seccion;
	    
	    

	public Secciones(Integer id_aula, String nivel, String grado, String seccion) {
			super();
			this.id_aula = id_aula;
			this.nivel = nivel;
			this.grado = grado;
			this.seccion = seccion;
		}



	public Integer getId_aula() {
			return id_aula;
		}



		public void setId_aula(Integer id_aula) {
			this.id_aula = id_aula;
		}



		public String getNivel() {
			return nivel;
		}



		public void setNivel(String nivel) {
			this.nivel = nivel;
		}



		public String getGrado() {
			return grado;
		}



		public void setGrado(String grado) {
			this.grado = grado;
		}



		public String getSeccion() {
			return seccion;
		}



		public void setSeccion(String seccion) {
			this.seccion = seccion;
		}



	public Secciones() {
		
	}

}
