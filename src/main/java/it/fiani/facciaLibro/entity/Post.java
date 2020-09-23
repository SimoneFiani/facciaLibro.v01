package it.fiani.facciaLibro.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String testoPost;
	private LocalDateTime instanteCreazione;
	private LocalDateTime instanteUltimoAggiornamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTestoPost() {
		return testoPost;
	}

	public void setTestoPost(String testoPost) {
		this.testoPost = testoPost;
	}

	public LocalDateTime getInstanteCreazione() {
		return instanteCreazione;
	}

	public void setInstanteCreazione(LocalDateTime instanteCreazione) {
		this.instanteCreazione = instanteCreazione;
	}

	public LocalDateTime getInstanteUltimoAggiornamento() {
		return instanteUltimoAggiornamento;
	}

	public void setInstanteUltimoAggiornamento(LocalDateTime instanteUltimoAggiornamento) {
		this.instanteUltimoAggiornamento = instanteUltimoAggiornamento;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", testoPost=" + testoPost + ", instanteCreazione=" + instanteCreazione
				+ ", instanteUltimoAggiornamento=" + instanteUltimoAggiornamento + "]";
	}

}
