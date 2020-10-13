create database olimpiadas;
use olimpiadas;

create table atleta (
idAtleta int primary key auto_increment,
Nome varchar(40),
Modalidade varchar(40),
qtdMedalha int);

insert into atleta values 
(null, 'João Vitor', 'Muay thay', 4),
(null, 'Marcia', 'Futebol', 3),
(null, 'Cleber', 'Corrida', 0),
(null, 'Aline', 'Esgrima', 2),
(null, 'Mathias', 'Futebol', 1),
(null, 'Pedro Luiz', 'Corrida', 3),
(null, 'Gilberto Silva', 'Skate', 5);

select *from atleta;
select nome, qtdMedalha from atleta;
select *from atleta where modalidade = 'Futebol';
select modalidade from atleta;
select *from atleta order by qtdMedalha desc;
select *from atleta where nome like '%s%';
select *from atleta where nome like 'C_%';
select *from atleta where nome like '%_o';
select *from atleta where nome like '%r_';
drop table atleta;