package br.emprestimo.testeUnitario;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class CadastrarEmprestimo {
	
	private static Emprestimo emprestimo;
	private static Livro livro;
	private static Usuario usuario;
	
	@Before
	public void setUp(){
		livro = new Livro();
		livro.setIsbn("000");
		livro.setAutor("Autor");
		livro.setTitulo("Titulo");
		
		usuario = new Usuario();
		usuario.setNome("Nome");
		usuario.setRa("00000000");
		
		emprestimo = new Emprestimo();
		emprestimo.setLivro(livro);
		emprestimo.setUsuario(usuario);
		emprestimo.setDataEmprestimo("20/12/2012");
		emprestimo.setDataDevolucao("23/12/2012");
	}
	
	@After
	public void tearDownClass(){
	}
	
	
	@Test(expected=RuntimeException.class)
	public void EmprestimoLivroNulo(){
		livro = null;
		emprestimo.setLivro(livro);
	}
	
	@Test(expected=RuntimeException.class)
	public void EmprestimoUsuarioNulo(){
		usuario = null;
		emprestimo.setUsuario(usuario);
	}
	
	@Test(expected=RuntimeException.class)
	public void EmprestimoDataEmprestimoNulo(){
		 emprestimo.setDataEmprestimo(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void EmprestimoDataDevolucaoNulo(){
		 emprestimo.setDataDevolucao(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void EmprestimoDataEmprestimoVazio(){
		 emprestimo.setDataEmprestimo("");
	}
	
	@Test(expected=RuntimeException.class)
	public void EmprestimoDataDevolucaoVazio(){
		 emprestimo.setDataDevolucao("");
	}
	
	@Test(expected=RuntimeException.class)
	public void EmprestimoDataEmprestimoInvalida(){
		emprestimo.setDataEmprestimo("2012");
	}
	
	@Test(expected=RuntimeException.class)
	public void EmprestimoDataDevolucaoInvalida(){
		emprestimo.setDataDevolucao("2012");
	}
	
}
