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

import it.fiani.facciaLibro.entity.Post;
import it.fiani.facciaLibro.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostService postService;

	@GetMapping("/")
	public String indexPost(Model datiInOutput) {
		List<Post> listaPost = postService.mostraListaPost();
		datiInOutput.addAttribute("listaPost", listaPost);
		return "index-post";
	}

	@GetMapping("/new")
	public String formPost() {
		return "form-post";
	}

	@PostMapping("/")
	public String salvaPost(Post post) {
		postService.salva(post);
		return "redirect/utente/id/post";
	}

	@GetMapping("/{id}")
	public String idPost(@PathVariable Long id, Model datiInOutput) {
		Post post = postService.cercaPostPerId(id);
		datiInOutput.addAttribute("post", post);
		return null;
	}

	@DeleteMapping("/{id}")
	public String cancellaPost(@PathVariable Long id) {
		postService.cancellaPost(id);
		return null;
	}

}
