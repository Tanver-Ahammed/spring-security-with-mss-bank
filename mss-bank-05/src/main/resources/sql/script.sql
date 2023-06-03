create
mss_bank;

create table users
(
    id       int          not null auto_increment primary key,
    username varchar(50)  not null,
    password varchar(500) not null,
    enabled  boolean      not null
);

create table authorities
(
    id        int         not null auto_increment primary key,
    username  varchar(50) not null,
    authority varchar(50) not null
);

create unique index ix_auth_username on authorities (username, authority);

insert
ignore into users values (null, 'Tanver', '12345', 'true');
insert
ignore into authorities values (null, 'Tanver', 'write');

select *
from users;

select *
from authorities;

drop table users;
drop table authorities;