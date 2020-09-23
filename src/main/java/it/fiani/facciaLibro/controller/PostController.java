package it.fiani.facciaLibro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utente/id/post")
public class PostController {

	@GetMapping("/")
	public String indexPost(Model datiInOutput) {
		return "index-post";
	}

	@GetMapping("/new")
	public String formPost() {
		return "form-post";
	}

	@PostMapping("/")
	public String salvaPost() {
		return "redirect/utente/id/post";
	}

	@GetMapping("/{id}")
	public String idPost() {
		return null;
	}

}
