package com.example.buscaFipe;

import com.example.buscaFipe.models.MenuPrincipal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class BuscaFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BuscaFipeApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.exibirMenu();
	}
}
