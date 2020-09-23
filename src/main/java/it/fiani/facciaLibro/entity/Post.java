package it.fiani.facciaLibro.entity;

import java.time.LocalTime;

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
	private LocalTime instanteCreazione;
	private LocalTime instanteUltimoAggiornamento;

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

	public LocalTime getInstanteCreazione() {
		return instanteCreazione;
	}

	public void setInstanteCreazione(LocalTime instanteCreazione) {
		this.instanteCreazione = instanteCreazione;
	}

	public LocalTime getInstanteUltimoAggiornamento() {
		return instanteUltimoAggiornamento;
	}

	public void setInstanteUltimoAggiornamento(LocalTime instanteUltimoAggiornamento) {
		this.instanteUltimoAggiornamento = instanteUltimoAggiornamento;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", testoPost=" + testoPost + ", instanteCreazione=" + instanteCreazione
				+ ", instanteUltimoAggiornamento=" + instanteUltimoAggiornamento + "]";
	}

}
