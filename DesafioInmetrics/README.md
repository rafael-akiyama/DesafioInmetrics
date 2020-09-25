## ***Automação Web***
Projeto criado como um desafio para automatizar plataforma web proposto pela empresa Inmetrics.
<p> <br />


### ***Utilizado***

 - Java
 - Selenium
 - JUnit
 - Cucumber
 - BDD
 - Page Objects
 - Boas Práticas
<p> <br />

### ***Pré Requisito para execução***

- Java
- IDE
- Plugin Cucumber
<p> <br />

### ***Como executar os testes***

1. Clonar o repositório
2. Importar o projeto para a IDE
3. Executar a classe Runner (DesafioInmetrics > src/test/java > br.com.web.runners > Runner.java)
<p> <br />

### ***Evidências e Relatório***

Após a execução será criado um diretório na raíz do projeto de nome screenshot para armazenar as evidências de sucesso ou falha e será gerado um relatório .html no diretório report, também na raíz do projeto.
<p> <br />

### ***Documentação***

[Java Docs](https://docs.oracle.com/en/java/)<br />
[Selenium Docs](https://www.selenium.dev/documentation/en/)<br />
[JUnit Docs](https://junit.org/junit5/docs/current/user-guide/)<br />
[Cucumber Docs](https://cucumber.io/docs/cucumber/)
<p> <br />
 
### ***Pontos a serem Considerados***

Sei que a melhor forma de lidar com um elemento na automação é através de id ou name, porém nesta automação foi utilizado outras formas como CSS Selector e Xpath para demonstrar conhecimento variado do uso de captura de elementos.
<p> <br />
 
### ***Melhorias a se Fazer***

1. Ao Efetuar o cadastro de usuario, não retorna nenhuma mensagem de confirmação, somente retorna a página para fazer o login, poderia aparecer uma mensagem de confirmação que o usuário foi cadastrado.

2. Quando um funcionário é cadastrado, a mensagem de confirmação que aparece é que um usuário foi cadastrado, poderia aparecer a mensagem que um funcionário foi cadastrado.

3. Na pesquisa de funcionários, não é possível filtrar a busca por tipo de contratação.

4. Quando entra no cadastro dos funcionários, aparece um layout, e assim que a página carrega a opção de busca, o layout altera e some informações como salário por exemplo.

5. Quando entra no modo edição de funcionário e não faz nenhuma alteração, depois que clica em ok, aparece uma mensagem de confirmação que foi alterado, mesmo não sendo alterado nada.

6. Quando um funcionário é exluido, o registro exclui na hora, não pergunta se realmente quer excluir, pois se a pessoa clica sem querer, ele exclui o registro direto, isso poderia ser alterado para aparecer a confirmação se realmente quer excluir o registro


