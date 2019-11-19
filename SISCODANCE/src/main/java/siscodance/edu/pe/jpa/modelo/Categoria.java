package siscodance.edu.pe.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_cat")
    private Integer id_cat;
    @Column(name = "nom_cate")
    private String nom_cate;
   

	public Integer getId_cat() {
		return id_cat;
	}


	public Categoria(Integer id_cat, String nom_cate) {
		super();
		this.id_cat = id_cat;
		this.nom_cate = nom_cate;
	}


	public void setId_cat(Integer id_cat) {
		this.id_cat = id_cat;
	}


	public String getNom_cate() {
		return nom_cate;
	}


	public void setNom_cate(String nom_cate) {
		this.nom_cate = nom_cate;
	}


	public Categoria() {
		
	}

}
