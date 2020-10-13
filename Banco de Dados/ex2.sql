create table Musica (
idMusica int primary key auto_increment,
Titulo varchar(40),
Artista varchar(40),
Genero varchar(40)
);
insert into Musica values
(null,'Pokerface','Lady Gaga','POP'),
(null,'Bad Romance','Lady Gaga','POP'),
(null,'Buried Alive','Avenged sevenfold','Rock'),
(null,'Burguesinha','Seu Jorge','Pagode'),
(null,'Camisa 10','Turma do pagode','Pagode'),
(null,'Victorious','PATD!','Rock-pop'),
(null,'Death of a bacheralor','PATD!','Rock');
select * from Musica;
select Titulo, Artista from Musica;
select * from Musica where Genero = 'POP';
select * from Musica where Artista = 'PATD!';
select * from Musica order by Titulo;
select * from Musica order by Artista desc;
select * from Musica where Titulo like 'B%';
select * from Musica where Artista like '%e';
select * from Musica where Genero like '_o%';
select * from Musica where Genero like '%d_';