package com.eventoapp.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity (name="tb_evento")
public class Evento {
	String nome;
	String local;
	String data;
	String horario;	

	@Id
	@GeneratedValue(generator="UUID")
	private UUID id;


}
