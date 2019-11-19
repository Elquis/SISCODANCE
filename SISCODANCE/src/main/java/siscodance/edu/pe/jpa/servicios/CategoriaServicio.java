package siscodance.edu.pe.jpa.servicios;

import javax.transaction.Transactional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siscodance.edu.pe.jpa.modelo.Categoria;
import siscodance.edu.pe.jpa.repositorios.CategoriaRepositorio;


@Service
@Transactional
public class CategoriaServicio {
	@Autowired
	private CategoriaRepositorio repositorio;

	public CategoriaServicio() {
		
	}
	public List<Categoria> buscarTodo() {
		return (List<Categoria>) repositorio.findAll();  
	}
	public Categoria crear(Categoria categoria) {
		return repositorio.save(categoria);
	}
	public Categoria actualizar(Categoria categoriaActualizar) {
		Categoria categoriaActual = repositorio.findById(categoriaActualizar.getId_cat()).get();
		categoriaActual.setNom_cate(categoriaActualizar.getNom_cate());
		
		Categoria categoriaActualizado = repositorio.save(categoriaActual);
		return categoriaActualizado;
	}
	public Categoria buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}
	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}
	

}
