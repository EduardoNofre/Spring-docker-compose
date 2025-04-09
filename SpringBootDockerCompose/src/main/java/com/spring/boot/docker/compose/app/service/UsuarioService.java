package com.spring.boot.docker.compose.app.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;
import com.spring.boot.docker.compose.app.UsuarioRepository;
import com.spring.boot.docker.compose.app.entity.Usuario;

import lombok.Data;

@Data
@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	private final Faker faker = new Faker();

	public void criarUsuarios() {

		for (int i = 0; i <= 10; i++) {

			Usuario persiste = new Usuario();
			persiste.setNome(faker.gameOfThrones().character());
			persiste.setIdade(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(faker.date().birthday())));
			usuarioRepository.save(persiste);
		}
	}

	public List<Usuario> listaUsuarios() {

		return usuarioRepository.findAll();

	}
}
