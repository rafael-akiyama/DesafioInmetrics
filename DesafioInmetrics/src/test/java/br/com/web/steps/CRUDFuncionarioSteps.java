package br.com.web.steps;

import br.com.web.pages.CRUDFuncionarioPage;
import br.com.web.pages.LogarPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CRUDFuncionarioSteps {

	private CRUDFuncionarioPage page = new CRUDFuncionarioPage();
	private LogarPage log = new LogarPage();

	@Dado("^que um usuario esteja logado na plataforma inmrobo$")
	public void queUmUsuarioEstejaLogadoNaPlataformaInmrobo() throws Throwable {
		log.acessarSite();
		log.preencherDadosDeLogin();
	}

	@Quando("^cadastrar um novo funcionario$")
	public void cadastrarUmNovoFuncionario() throws Throwable {
		page.cadastrarFuncionario();
	}

	@Entao("^sera exibida uma mensagem de cadastrado com sucesso$")
	public void seraExibidaUmaMensagemDeCadastradoComSucesso() throws Throwable {
		page.validarCadastroDeFuncionario();
	}

	@Quando("^pesquisar um funcionario existente$")
	public void pesquisarUmFuncionarioExistente() throws Throwable {
		page.pesquisarFuncionario();
	}

	@Entao("^sera exibido o registro do funcionario$")
	public void seraExibidoORegistroDoFuncionario() throws Throwable {
		page.validarPesquisaDeFuncionario();
	}

	@Quando("^editar um funcionario$")
	public void editarUmFuncionario() throws Throwable {
		page.editarFuncionario();
	}

	@Entao("^sera exibida uma mensagem de atualizacao com sucesso$")
	public void seraExibidaUmaMensagemDeAtualizacaoComSucesso() throws Throwable {
		page.validarEdicaoDeFuncionario();
	}

	@Quando("^excluir um funcionario$")
	public void excluirUmFuncionario() throws Throwable {
		page.excluirFuncionario();
	}

	@Entao("^sera exibida uma mensagem de excluido com sucesso$")
	public void seraExibidaUmaMensagemDeExcluidoComSucesso() throws Throwable {
		page.validarExclusaoDeFuncionario();
	}
}		