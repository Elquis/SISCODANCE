package siscodance.edu.pe.jpa.servicios;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siscodance.edu.pe.jpa.modelo.Jurado;
import siscodance.edu.pe.jpa.repositorios.JuradoRepositorio;

@Service
@Transactional
public class JuradoServicio {
	
	@Autowired
	private JuradoRepositorio repositorio;
	

	public JuradoServicio() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Jurado> buscarTodo() {
		return (List<Jurado>) repositorio.findAll();  
	}

	public Jurado crear(Jurado jurado) {
		return repositorio.save(jurado);
	}
	public Jurado actualizar(Jurado juradoActualizar) {
		Jurado juradoActual = repositorio.findById(juradoActualizar.getId_jurado()).get();
		juradoActual.setNom_jurado(juradoActualizar.getNom_jurado());
		juradoActual.setApep_jurado(juradoActualizar.getApep_jurado());
		juradoActual.setApem_jurado(juradoActualizar.getApem_jurado());
		juradoActual.setDni(juradoActualizar.getDni());
		
		Jurado juradoActualizado = repositorio.save(juradoActual);
		return juradoActualizado;
	}
	
	public Jurado buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}

	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}

}
