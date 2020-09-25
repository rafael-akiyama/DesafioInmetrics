package br.com.web.util;

import java.util.Random;

public class Parametros {

	static Random aleatorio = new Random();
	static int valor = aleatorio.nextInt(100000);

	public static String criarNomeFuncionario = "Funcionario" + valor;
	public static String criarNomeUsuario = "Usuario" + valor;
	public static String criarSenha = "" + valor;
	public static String usuarioCadastrado = "usuario1";
	public static String senhaCadastrada = "senha1";
	public static String sexo = "Masculino";
	public static String admissao = "23/09/2020";
	public static String cargo = "Analista de Teste";
	public static String salario = "1000000";
}