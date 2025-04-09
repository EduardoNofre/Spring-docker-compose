package com.spring.boot.docker.compose.app.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	
	private LocalDate idade;
}
