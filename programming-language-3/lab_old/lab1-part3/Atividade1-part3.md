# Bloco 4 - Aplicaç (Parte III) - JPA

1. Indique o impacto da alteracoes realizada para que o JPA fosse utilizado na aplicao (Classes, paginas e recursos modificados).
	- Classe UsuarioDAOFactory, que instancia a classe UsuarioDAOJPAImpl
	- Classe UsuarioDAOJPAImpl, que refatora os metodos de busca para utilizar os metodos de persistencia, como por exemplo o EntityManagerFactory e o EntityManager
	- O Model de Uauario que receberam as anotation referentes ao JPA para persistencia do model no SGBD
    - No meu caso, que estou usando o server tomcat dentro de uma maquina vagrant, tive o problema durante a criacao da PersistenceUnit via Netbeans, e acabei criando o persistence.xml manualmente dentro da pasta META-INF.
