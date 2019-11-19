package siscodance.edu.pe.jpa.servicios;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import siscodance.edu.pe.jpa.modelo.Criterios;
import siscodance.edu.pe.jpa.repositorios.CriteriosRepositorio;

@Service
@Transactional
public class CriteriosServicio {

	@Autowired
	private CriteriosRepositorio repositorio;
	
	public CriteriosServicio() {
		// TODO Auto-generated constructor stub
	}
	public List<Criterios> buscarTodo() {
		return (List<Criterios>) repositorio.findAll(); 
	}

	public Criterios crear(Criterios criterios) {
		return repositorio.save(criterios);
	}
	
	public Criterios actualizar(Criterios criterioActualizar) {
		Criterios criterioActual = repositorio.findById(criterioActualizar.getId_criterios()).get();
		criterioActual.setNom_crit(criterioActualizar.getNom_crit());
		criterioActual.setDescr_crit(criterioActualizar.getDescr_crit());
		criterioActual.setPuntaje_maxt(criterioActualizar.getPuntaje_maxt());
		Criterios criterioActualizado = repositorio.save(criterioActual);
		return criterioActualizado;
	}

	public Criterios buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}

	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}
}
