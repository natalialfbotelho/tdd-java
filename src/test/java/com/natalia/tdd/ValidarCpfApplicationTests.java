package com.natalia.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.natalia.tdd.models.Cliente;

@SpringBootTest
class ValidarCpfApplicationTests {

	@Test
	@DisplayName("Dado que eu faça um teste com CPF válido")
	void fazendoTesteComCpfValido() {
		Cliente cliente = new Cliente();
		cliente.setNome("Natalia");
		cliente.setCpf("023.229.310-47");
		assertEquals(true, cliente.validarCPF());
	}
	
	@Test
	@DisplayName("Dado que eu faça um teste com CPF inválido")
	void fazendoTesteComCpfInvalido() {
		Cliente cliente = new Cliente();
		cliente.setNome("Natalia");
		cliente.setCpf("023.229.310-48");
		assertEquals(false, cliente.validarCPF());
	}
	
	@Test
	@DisplayName("Dado que eu faça um teste com CPF com um digito a menos")
	void fazendoTesteComCpfComDigitoAMenos() {
		Cliente cliente = new Cliente();
		cliente.setNome("Natalia");
		cliente.setCpf("023.229.310-4");
		assertEquals(false, cliente.validarCPF());
	}
	
	@Test
	@DisplayName("Dado que eu faça um teste com CPF com um digito a mais")
	void fazendoTesteComCpfComDigitoAMais() {
		Cliente cliente = new Cliente();
		cliente.setNome("Natalia");
		cliente.setCpf("023.229.310-477");
		assertEquals(false, cliente.validarCPF());
	}

}
