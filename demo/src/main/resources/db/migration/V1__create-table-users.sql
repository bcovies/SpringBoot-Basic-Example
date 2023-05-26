create table users(
  id bigint not null auto_increment,
  name varchar(100) not null,
  last_name varchar(100) not null,
  phone  varchar(100) not null,
  street_name varchar(100) not null,
  street_number varchar(100) not null,
  complement varchar(100) not null,

  primary key (id)
);