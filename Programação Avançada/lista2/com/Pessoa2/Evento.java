package Ex_17_Orientacao_Objetos;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public class Evento {
	
	private String nome;
	private String descricao;
	private LocalDateTime horaInicio;
	private LocalDateTime horaFim;
	private Date dataInicio; 
	private Date dataFim; 
	
	private Set<Pessoa> pessoa = new HashSet<>();
	
	public Evento() {
		
		
	}

	public Evento(String nome, String descricao, Timer LocalDateTime, LocalDateTime horaFim, Date dataInicio, Date dataFim,
			Set<Pessoa> pessoa) {
		
		super();
		
		this.nome = nome;
		this.descricao = descricao;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getDescricao() {
		
		return descricao;
	}

	public void setDescricao(String descricao) {
		
		this.descricao = descricao;
	}

	public LocalDateTime getHoraInicio() {
		
		return horaInicio;
	}

	public void setHoraInicio(LocalDateTime horaInicio) {
		
		this.horaInicio = horaInicio;
	}

	public LocalDateTime getHoraFim() {
		
		return horaFim;
	}

	public void setHoraFim(LocalDateTime horaFim) {
		
		this.horaFim = horaFim;
	}

	public Date getDataInicio() {
		
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		
		this.dataFim = dataFim;
	}
	
	public void compartilharEvento() {
		
		LocalDateTime horaInicio = LocalDateTime.parse("2022-09-23T18:30:26");
		LocalDateTime horaFim = LocalDateTime.parse("2022-09-23T21:30:26");
		
		System.out.println("O Nome do Evento: " + nome); 
		System.out.println("Descrição do evento: " + descricao); 
		System.out.println("Horário Inicial do Evento: " + horaInicio.getHour());
		System.out.println("Horário Final do Evento: " + horaFim.getHour());
		System.out.println("Data do Inicio do Evento: " + dataInicio);
		System.out.println("Data Final do Evento: " + dataFim);
	}
}
