insert into Blogger (nev,kor) VALUES ('Hofi', 47);
insert into Blogger (nev,kor) VALUES ('Gyula', 35);
insert into CIKK (cim,tartalom,kozzetetel,kepURL,blogger_id) values ('Első cikk címe','Első cikk tartalma bla bla bla bla bla bla bla bla ', CURRENT_TIMESTAMP(), 'images/fulls/01.jpg', (select id FROM BLOGGER where nev = 'Gyula') );
insert into CIKK (cim,tartalom,kozzetetel,kepURL,blogger_id) values ('Teszt2 cím','Teszt2 tartalom2', CURRENT_DATE(), 'images/fulls/02.jpg', (select id FROM BLOGGER where nev = 'Gyula') );
insert into CIKK (cim,tartalom,kozzetetel,kepURL,blogger_id) values ('Hofi cím','Hofi cikke', '2018-10-10',  'images/fulls/03.jpg', (select id FROM BLOGGER where nev = 'Hofi') );
insert into CIKK (cim,tartalom,kozzetetel,kepURL,blogger_id) values ('Hofi2 cím','Hofi tartalom2', CURRENT_DATE(), 'images/fulls/04.jpg', (select id FROM BLOGGER where nev = 'Hofi') );
insert into CIKK (cim,tartalom,kozzetetel,kepURL,blogger_id) values ('Hofi3 cím','Szia tartalom2', CURRENT_DATE(), 'images/fulls/05.jpg', (select id FROM BLOGGER where nev = 'Hofi') );
insert into CIKK (cim,tartalom,kozzetetel,kepURL,blogger_id) values ('Gyula cím','Gyula tartalom', CURRENT_DATE(), 'images/fulls/06.jpg', 2);
insert into CIKK (cim,tartalom,kozzetetel,kepURL,blogger_id) values ('Tesztcim','Teszt tartalom asdskdhdw', CURRENT_DATE(), 'images/fulls/01.jpg', 1);
