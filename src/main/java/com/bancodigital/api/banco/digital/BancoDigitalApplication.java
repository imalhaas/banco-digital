package com.bancodigital.api.banco.digital;

import com.bancodigital.api.banco.digital.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoDigitalApplication {


	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ALGAMONEY-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Cliente cliente = entityManager.find(Cliente.class, 1);
		System.out.println(cliente.getNome());

		entityManager.close();
		entityManagerFactory.close();
	}
}
