Aluno: Clauber Stipkovic - 31243045

# Atividade 1

## Bloco 1

### Questões (respostas)

1. No meu caso, utilizando o apache derby dentro do ubuntu, ele criou uma pasta com o nome do DB, por tanto, devo apenas copiar essa pasta.

2. Professor, como não tenho máquina com windows (tenho apenas Mac e Linux) acabei criando uma máquina usando vagrant com ubuntu e instalando o Tomcat e Apache Derby dentro dela, então nao tive problemas com o tutorial, apenas tive que executar o apache derby para responder pelo IP da máquina vagrant, e com isso acessar o DB via Squirrel.

## Bloco 2

1. Alterações feitas:
  - nome da classe para ListarUsuariosController
  - método execute(), no parâmetro do getLogger()
  - parâmetro control dentro do index.html

2. Alterações feitas:
 - Criacao da classe BuscaUsuarioController
 - buscarUsuario.html (para informar o nome buscado)
 - buscaUsuarios.jsp (lista o usuario encontrado)

3. O FrontController que esta listado no web.xml recebe o parametro na url ("control") e direciona para o Controller informado no parametro para carregar a referencia do servlet.

4. Passando os atributos para a pagina via setAttribute como um "get"

5. Como no meu caso estou usando uma maquina vagrant, basta eu passar a imagem com a configuracao do server e o .war do projeto para ser rodado em outro lugar.
