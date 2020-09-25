package br.com.web.pages;

import static br.com.web.core.DriverFactory.getDriver;
import static br.com.web.util.Parametros.criarNomeUsuario;
import static br.com.web.util.Parametros.criarSenha;

import org.openqa.selenium.By;

import br.com.web.core.BasePage;

public class CadastrarUsuarioPage extends BasePage {

	// Elementos Web
	By linkCadastreSe = By.cssSelector("a[href*='signup']");
	By campoUsuario = By.name("username");
	By campoSenha = By.name("pass");
	By campoConfirmeSenha = By.name("confirmpass");
	By botaoCadastrar = By.cssSelector("button[class*='login100']");
	By textoLogin = By.cssSelector("span[class*='login']");
	
	public void acessarSite() throws Exception {
		getDriver().get("http://www.inmrobo.tk/accounts/login/");
	}

	public void preencherDadosDeCadastro() {
		clicar(linkCadastreSe);
		escrever(campoUsuario, criarNomeUsuario);
		escrever(campoSenha, criarSenha);
		escrever(campoConfirmeSenha, criarSenha);
		clicar(botaoCadastrar);
	}

	public void validarCadastroDeUsuario() {
		validarTexto("Login", textoLogin);
	}
}