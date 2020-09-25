package br.com.web.steps;

import br.com.web.pages.LogarPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LogarSteps {

	private LogarPage page = new LogarPage();

	@Quando("^realizar o login de um usuario cadastrado$")
	public void realizarOLoginDeUmUsuarioCadastrado() throws Throwable {
		page.preencherDadosDeLogin();
	}

	@Entao("^sera exibida a pagina de registro de funcionarios$")
	public void seraExibidaAPaginaDeRegistroDeFuncionarios() throws Throwable {
		page.validarLogin();
	}
}	