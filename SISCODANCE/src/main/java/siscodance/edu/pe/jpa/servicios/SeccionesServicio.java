package siscodance.edu.pe.jpa.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import siscodance.edu.pe.jpa.modelo.Secciones;

import siscodance.edu.pe.jpa.repositorios.SeccionesRepositorio;

@Service
@Transactional
public class SeccionesServicio {
	@Autowired
	private SeccionesRepositorio repositorio;
	

	public SeccionesServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Secciones> buscarTodo() {
		return (List<Secciones>) repositorio.findAll(); 
	
	}
	
	public Secciones crear(Secciones secciones) {
		return repositorio.save(secciones);
	}
	
	public Secciones actualizar(Secciones seccionesActualizar) {
		Secciones seccionActual = repositorio.findById(seccionesActualizar.getId_aula()).get();
		seccionActual.setNivel(seccionesActualizar.getNivel());
		seccionActual.setGrado(seccionesActualizar.getGrado());
		seccionActual.setSeccion(seccionesActualizar.getSeccion());
		
		Secciones seccionActualizado = repositorio.save(seccionActual);
		return seccionActualizado;
	}
	
	public Secciones buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}
	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}

}
