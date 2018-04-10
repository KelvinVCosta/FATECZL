package br.emprestimo.testeUnitario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class CadastrarUsuario {
	public static Usuario usuario;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setNome("Usuario teste");
		usuario.setRa("1234567890");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	//Em branco
	@Test(expected=RuntimeException.class)
	public void AlunoNomeVazio(){
		usuario.setNome("");
	}
	
	@Test(expected=RuntimeException.class)
	public void AlunoRaVazio(){
		usuario.setRa("");
	}
	
	//Nulo
	@Test(expected=RuntimeException.class)
	public void AlunoNomeNulo(){
		usuario.setNome(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void AlunoRaNulo(){
		usuario.setRa(null);
	}
	
	
	//Validar
	@Test
	public void AlunoNomeValido(){
		assertEquals("Usuario teste", usuario.getNome());
	}
	
	@Test
	public void AlunoRaValido(){
		assertEquals("1234567890", usuario.getRa());
	}
	
	//Teste de mensagem
	@Test
	public void AlunoNomeMsg(){
		try{
			usuario.setNome("");
			fail("Exception nao lançada");
		} catch(RuntimeException ex){
			assertEquals("Nome invalido", ex.getMessage());
		}
	}
	
	@Test
	public void AlunoRaMsg(){
		try{
			usuario.setRa("");
			fail("Exception nao lançada");
		} catch(RuntimeException ex){
			assertEquals("RA invalido", ex.getMessage());
		}
	}
	
}
