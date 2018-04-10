package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

public class UC06CadastrarLivro {
	public static Livro livro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//ISBN em branco
	@Test(expected = RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_isbn_invalido_branco() {
		livro.setIsbn("");
	}

	//ISBN nulo
	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_isbn_invalido_nulo() {
		livro.setIsbn(null);
	}

	//Validar ISBN
	@Test
	public void CT03UC06CadastrarLivro_com_isbn_valido() {
		assertEquals("121212", livro.getIsbn());
	}

	//ISBN teste de mensagem
	@Test
	public void CT04UC01CadastrarLivro_com_isbn_invalido() {
		try {
			livro.setIsbn("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("ISBN invalido", e.getMessage());
		}
	}

	//Titulo em branco
	@Test(expected = RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_titulo_invalido_branco() {
		livro.setTitulo("");
	}

	//Titulo nulo
	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_titulo_invalido_nulo() {
		livro.setTitulo(null);
	}

	//Titulo valido
	@Test
	public void CT03UC06CadastrarLivro_com_titulo_valido() {
		assertEquals("Engenharia de Software", livro.getTitulo());
	}

	//Titulo Teste de mensagem
	@Test
	public void CT04UC01CadastrarLivro_com_titulo_invalido() {
		try {
			livro.setTitulo("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Titulo invalido", e.getMessage());
		}
	}

	//Autor em branco
	@Test(expected = RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_autor_invalido_branco() {
		livro.setAutor("");
	}

	//Autor nulo
	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_autor_invalido_nulo() {
		livro.setAutor(null);
	}

	//Autor valido
	@Test
	public void CT03UC06CadastrarLivro_com_autor_valido() {
		assertEquals("Pressman", livro.getAutor());
	}

	//Autor teste de mensagem
	@Test
	public void CT04UC01CadastrarLivro_com_autor_invalido() {
		try {
			livro.setAutor("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Autor invalido", e.getMessage());
		}
	}

}
