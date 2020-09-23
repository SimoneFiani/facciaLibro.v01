package it.fiani.facciaLibro.entity;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String cognome;
	private int eta;
	private String indirizzoResidenza;
	private String numeroTelefono;

	@OneToMany
	private List<Post> listaPost;

	private LocalTime instanteCreazione;
	private LocalTime instanteUltimoAggiornamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getIndirizzoResidenza() {
		return indirizzoResidenza;
	}

	public void setIndirizzoResidenza(String indirizzoResidenza) {
		this.indirizzoResidenza = indirizzoResidenza;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public List<Post> getListaPost() {
		return listaPost;
	}

	public void setListaPost(List<Post> listaPost) {
		this.listaPost = listaPost;
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
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", indirizzoResidenza="
				+ indirizzoResidenza + ", numeroTelefono=" + numeroTelefono + ", listaPost=" + listaPost
				+ ", instanteCreazione=" + instanteCreazione + ", instanteUltimoAggiornamento="
				+ instanteUltimoAggiornamento + "]";
	}

}
