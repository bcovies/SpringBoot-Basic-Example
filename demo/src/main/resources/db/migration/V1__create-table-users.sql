create table users(
  id bigint not null auto_increment,
  email varchar(100) not null,
  passwd varchar(100) not null,

  primary key (id)
);