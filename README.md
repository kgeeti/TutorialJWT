# TutorialJWT
Tutorial JWT
Neste tutorial é apresentado como implementar segurança JWt (Java Web Token) em uma REST-API
utilizando os recursos SPRING.

Será criado um endpoint para produtos e um endpoint para autenticação.

# Preparação da Base de Testes

Faça as correções de acesso a base em Projects -> Other Sources -> src/main/resources -> default package -> application.properties
Ajuste o nome da base conforme sua necessidade.

create database kge_tutorialjwt;
use kge_tutorialjwt;

create table produto(
id bigint auto_increment,
    descricao varchar(100),
    qtd decimal(10,2),
    valor_unitario decimal(10,2),
    primary key(id)
);

insert into produto(descricao, qtd, valor_unitario) values
("Teclado USB", 100, 20),
("Mouse", 100, 28.90),
("Monitor 17'", 100, 227.90),
("Gabinete Gamer", 80, 160.50),
("Processador Intel i7 10a ", 80, 360.50),
("Cooler LED RGB", 100, 8);

create table user(
	id bigint auto_increment,
    email varchar(80),
    password varchar(100),
    primary key(id)
    );
    
select * from user;

# Popular a base User
Para executar esta ação - que é será considerada como um teste de base - executada apenas 1 vez -
colocar a classe UserRepositoryTests.java no TestPackages e executar o teste com 
botão direito em cima do projeto - Test (Alt+F6) ou Clean & Rebuild.

