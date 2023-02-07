package model;

import java.util.Date;

public class Dipendenti {
	private String nome;
	private String cognome;
	private String ruoloAziendale;
	private Date dataNascita;
	public Dipendenti(String nome, String cognome, String ruoloAziendale, Date dataNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.ruoloAziendale = ruoloAziendale;
		this.dataNascita = dataNascita;
	}
	public Dipendenti() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getRuoloAziendale() {
		return ruoloAziendale;
	}
	public void setRuoloAziendale(String ruoloAziendale) {
		this.ruoloAziendale = ruoloAziendale;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	@Override
	public String toString() {
		return "dipendenti [nome=" + nome + ", cognome=" + cognome + ", ruoloAziendale=" + ruoloAziendale
				+ ", dataNascita=" + dataNascita + "]";
	}

}
