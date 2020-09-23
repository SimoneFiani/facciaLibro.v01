package it.fiani.facciaLibro.service;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.fiani.facciaLibro.entity.Utente;
import it.fiani.facciaLibro.repository.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	UtenteRepository utenteRepository;

	public List<Utente> mostraListaUtenti() {

		return (List<Utente>) utenteRepository.findAll();
	}

	public void salva(Utente utente) {
		utente.setInstanteCreazione(LocalTime.now());
		utente.setInstanteUltimoAggiornamento(LocalTime.now());
		utenteRepository.save(utente);

	}

	public void cancellaUtente(Long id) {
		utenteRepository.deleteById(id);
	}

}
