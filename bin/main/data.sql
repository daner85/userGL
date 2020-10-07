drop table if exists USUARIOS_PHONES;
drop table if EXISTS phones;
drop table if EXISTS usuarios;


create table usuarios_phones(
user_entity_id uuid,
phones_id uuid
);

CREATE TABLE usuarios (
  id uuid default random_uuid()  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  created Date not null,
  modified Date not null,
  lastLogin Date not null,
  active VARCHAR(1) not null,
  token VARCHAR(250)
);

CREATE TABLE phones (
  id uuid default random_uuid()  PRIMARY KEY,
  number VARCHAR(250)  NULL,
  citycode VARCHAR(250)  NULL,
  countrycode VARCHAR(250) NULL
);



--INSERT INTO USUARIOS ( NAME, EMAIL, PASSWORD, created, modified, lastLogin, active,id) VALUES
--  ('JUAN', 'PEREDZ@BCI.COM', 'ADMINADMIN',parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),1,'2D1EBC5B7D2741979CF0E84451C5BBB1'),
--  ('BILL', 'GATES@BCI.COM', '123123',parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),0,'2D1EBC5B7D2741979CF0E84451C5BBB2'),
--  ('FORTUNATO', 'ALAKIJA@BCI.COM', '88888',parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),1,'2D1EBC5B7D2741979CF0E84451C5BBB3');

--insert into phones (number, citycode, countrycode,id) values
--('12','12','12','2D1EBC5B7D2741979CF0E84451C5BBB1'),
--('14','14','14','2D1EBC5B7D2741979CF0E84451C5BBB3'),
--('15','15','15','2D1EBC5B7D2741979CF0E84451C5BBB2');

