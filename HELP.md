# 옷장 프로젝트

* [github 주소](https://github.com/likelion-jisu/closet)

## 구성
* Spring Boot 2.6.2
* PostgreSQL 13.5
* JPA 2.6.2
* Swagger 2.9.2

### PostgreSQL 로컬 세팅 스크립트 (mac)

* brew install postgresql@13
* 설치 확인 : postgres --version
* 실행 : brew services start postgresql
* 실행 확인 : psql postgres


* 유저 추가 : create user closet password 'closet' superuser;
* DB 추가 : create database closet_db owner closet;
* 테이블 추가
```shell script
create table TBB_USER (
user_id varchar(20) primary key,
pw varchar(50) not null,
bl_yn bool not null,
name varchar(20),
email varchar(50),
phone_no varchar(14),
sex varchar(1),
last_login_dtti timestamp,
rgst_dtti timestamp not null,
updt_dtti timestamp not null
);
```