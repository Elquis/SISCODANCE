package siscodance.edu.pe.jpa.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siscodance.edu.pe.jpa.modelo.Ficha_calificacion;
import siscodance.edu.pe.jpa.repositorios.FichaCalificacionRepositorio;

@Service
@Transactional
public class FichaCalificacionServicio {

	@Autowired
	private FichaCalificacionRepositorio repositorio;
	
	public FichaCalificacionServicio() {
		// TODO Auto-generated constructor stub
	}
	public List<Ficha_calificacion> buscarTodo() {
		return (List<Ficha_calificacion>) repositorio.findAll();  
	}

	public Ficha_calificacion crear(Ficha_calificacion ficha_calificacion) {
		return repositorio.save(ficha_calificacion);
	}
	public Ficha_calificacion actualizar(Ficha_calificacion fichaActualizar) {
		Ficha_calificacion fichaActual = repositorio.findById(fichaActualizar.getId_fichacal()).get();
		fichaActual.setCalificacion(fichaActualizar.getCalificacion());
		fichaActual.setObservacion(fichaActualizar.getObservacion());
		
		Ficha_calificacion fichaActualizado = repositorio.save(fichaActual);
		return fichaActualizado;
	}
	public Ficha_calificacion buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}

	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}
}
