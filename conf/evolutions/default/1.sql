# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigserial not null,
  ip_address                    varchar(255),
  created                       timestamptz not null,
  updated                       timestamptz not null,
  constraint pk_address primary key (id)
);


# --- !Downs

drop table if exists address cascade;

