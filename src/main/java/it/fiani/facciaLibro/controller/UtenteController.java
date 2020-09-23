package it.fiani.facciaLibro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.fiani.facciaLibro.entity.Utente;
import it.fiani.facciaLibro.service.UtenteService;

@Controller
@RequestMapping("/utenti")

public class UtenteController {

	@Autowired
	UtenteService utenteService;

	@GetMapping("/")
	public String index(Model datiInOutput) {
		List<Utente> listaUtenti = utenteService.mostraListaUtenti();
		datiInOutput.addAttribute("listaUtenti", listaUtenti);
		return "index-utenti";
	}

	@GetMapping("/new")
	public String formUtente() {
		return "form-utenti";
	}

	@PostMapping("/")
	public String aggiungiUtente(Utente utente) {
		utenteService.salva(utente);
		return "redirect:/utenti/";
	}

	@GetMapping("/{id}")
	public String idUtente(@PathVariable Long id, Model datiInOutput) {
		Utente utente = utenteService.cercaUtentePerId(id);
		datiInOutput.addAttribute("utente", utente);

		return "dettagli-utente";
	}

	@DeleteMapping("/{id}")
	public String rimuoviUtente(@PathVariable Long id) {
		utenteService.cancellaUtente(id);
		return "redirect/utenti";

	}

}
