package com.example.sistemamatricula.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mensagem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mensagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String mensagem;

	private LocalDateTime data;

	@ManyToOne
	@JoinColumn(name = "id_atendente")
	private Atendente atendente;

	@ManyToOne
	@JoinColumn(name = "id_aluno")
	private Aluno aluno;
}
