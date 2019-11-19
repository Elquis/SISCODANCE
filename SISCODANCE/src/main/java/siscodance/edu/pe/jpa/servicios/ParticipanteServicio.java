package siscodance.edu.pe.jpa.servicios;

import java.*;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siscodance.edu.pe.jpa.modelo.Participante;
import siscodance.edu.pe.jpa.repositorios.ParticipanteRepositorio;

@Service
@Transactional
public class ParticipanteServicio {
	
	@Autowired
	private ParticipanteRepositorio repositorio;

	public ParticipanteServicio() {
		// TODO Auto-generated constructor stub
	}
	public List<Participante> buscarTodo() {
		return (List<Participante>) repositorio.findAll(); 
	
	}
	public Participante crear(Participante participante) {
		return repositorio.save(participante);
	}
	public Participante actualizar(Participante participanteActualizar) {
		Participante participanteActual = repositorio.findById(participanteActualizar.getId_inscrip()).get();
		participanteActual.setNom_danza(participanteActualizar.getNom_danza());
		participanteActual.setFecha_hora(participanteActualizar.getFecha_hora());
		
		Participante participanteActualizado = repositorio.save(participanteActual);
		return participanteActualizado;
	}
	
	public Participante buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}
	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}
}
