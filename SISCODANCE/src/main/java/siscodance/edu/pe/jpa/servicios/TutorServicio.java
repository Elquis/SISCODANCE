package siscodance.edu.pe.jpa.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siscodance.edu.pe.jpa.modelo.Tutor;
import siscodance.edu.pe.jpa.repositorios.TutorRepositorio;

@Service
@Transactional
public class TutorServicio {
	
	@Autowired
	private TutorRepositorio repositorio;
	


	public TutorServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Tutor>buscarTodo(){
		return (List<Tutor>) repositorio.findAll(); 
	}
	
	public Tutor crear(Tutor tutor) {
		return repositorio.save(tutor);
	}
	
	public Tutor actualizar(Tutor tutorActualizar) {
		Tutor tutorActual = repositorio.findById(tutorActualizar.getTutor_id()).get();
		tutorActual.setNom_tut(tutorActualizar.getNom_tut());
		tutorActual.setApep_tut(tutorActualizar.getApep_tut());
		tutorActual.setApem_tut(tutorActualizar.getApem_tut());
		tutorActual.setDni(tutorActualizar.getDni());
		Tutor tutorActualzado = repositorio.save(tutorActual);
		return  tutorActualzado;
		
	}
	
	public Tutor buscarPorID(Integer id ) {
		return repositorio.findById(id).get();
	}
	
	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	
	}
	

}
