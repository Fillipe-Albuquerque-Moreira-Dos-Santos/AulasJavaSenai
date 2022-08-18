create database primeiroBanco;

use primeiroBanco;

CREATE TABLE pessoa(
nome varchar (50),
endereco varchar (150),
cpf varchar (14),
telefone varchar(15)
);

INSERT INTO pessoa VALUES ("Fillipe","aculá","033.584.691-23","(61)99381-3636");

INSERT INTO pessoa VALUES ("Aparecida Ignacia Peçanha","Rua Eleutério Cipriano Pinheiro","375.728.639-14","(47) 2323-9653");

INSERT INTO pessoa VALUES ("Aparecida Ignacia Peçanha","Rua Eleutério Cipriano Pinheiro","375.728.639-14","(47) 2323-9653");

INSERT INTO pessoa VALUES ("Aparecida Ignacia Peçanha","Rua Eleutério Cipriano Pinheiro","375.728.639-14","(47) 2323-9653"),
("Diego Pinho Souza","Travessa Jornal de Hoje","974.471.164-75","(82) 98831-2424"),
("Edmilson Antonio Barrada","Rua Acre","576.540.982-27","(97) 99343-7803");

INSERT INTO produto VALUES ("corola","1006.50");
select * from pessoa;

select nomeProduto from produto;

select * from produto;

create table produto (
nomeProduto varchar (50),
preco float (6, 2)
);

show tables;

desc pessoa;

create database Cadastro;
use Cadastro;

CREATE TABLE pessoa(
nome varchar (50),
endereco varchar (150),
sexo char,
telefone varchar(15),
idade int
);

INSERT INTO pessoa VALUES ("Aparecida Ignacia Peçanha","Rua Eleutério Cipriano Pinheiro","f","(47) 2323-9653","55");
INSERT INTO pessoa VALUES ("Peçanha","Rua  Pinheiro","f","(47) 2565-9653","55");
INSERT INTO pessoa VALUES (null,null,null,null,null);
INSERT INTO pessoa VALUES (" Ignacia ","Rua de jesus","f","(61) 2323-9653","55");
INSERT INTO pessoa VALUES (" maciano","rua 13","m","(61) 6161-2225","44");
INSERT INTO pessoa VALUES (" kleber","rua 13","m","(61) 6161-2225","44");
INSERT INTO pessoa VALUES (" Marialdo","rua 35","m","(61) 7777-2225","44");

select * from pessoa;

select sexo from pessoa;

select nome from pessoa where nome = ("Aparecida Ignacia Peçanha");

select nome from pessoa where nome like 'aparecida%'; -- Pesquisar pelo nome da pessoa

 

select nome from pessoa where nome like '%covas%'; -- Pesquisar em qualquer ambiente que chame o nome da pessoa

select nome,endereco, telefone from pessoa where sexo = 'm'; -- Pesquisa os dados aonde o sexo é =  a masculino.

select nome, telefone from pessoa where sexo = 'f' or endereco like '%quadra%'; -- Pesquisa com o ou

select nome, telefone from pessoa where sexo = 'f' and endereco like '%quadra%'; -- é intuitivo (Imporntante saber que a %  % é extremanete importante)

select count(*) from pessoa;

select count(*) as 'Qtd.dePessoas' from pessoa; -- Muito interessante esse select atribui um nome a quantidade de pessoas contadas

select sexo, count(*) as 'QtdPessoas do mesmo sexo' from pessoa group by sexo; -- Legal esse comando.. puxa a quantidade de pessoas do sexo masculino e feminino

select nome, idade from pessoa where telefone is null; -- selecionar dados nulos

select nome, idade from pessoa where telefone is not null; -- aonde o telefone não é vazio

select nome, count(*) as 'NomesiguaiseQTD' from pessoa group by nome; -- Nomes iguais e quantidade de nomes

update pessoa set telefone ="(61)9656-8522" where telefone = null;

alter table pessoa add idPessoa int primary key auto_increment; -- Adicionar primary key

alter table pessoa drop primary_key; -- Deletar uma coluna
select * from pessoa;

alter table pessoa modify column idPessoa int(10) first;

alter table pessoa modify column idPessoa int(10) after nome;

select concat(nome, "é do sexo:", sexo) as "mensagem" from pessoa;

select sum(2 + 2) as "Soma"; --  Cria uma adição

delete from pessoa where nome like 'Aparecida%';  -- deleta um nome da coluna 

delete from pessoa where idPessoa = 8;





set sql_safe_updates=0;
/*
Criar novo banco de dados ,
criar 1 tabela com nome, telefone, endereço, sexo, idade(int)
-- inserir 2 cadastros iguais,
-- inserir 2 cadastros com campos nulos

inserir pelo menos 10 cadastros
*/
