## Set up local database env

#### First make sure you have docker installed in your local machine
#### [Set up docker postgres](https://hub.docker.com/_/postgres)
* __start a postgres instance:__ ```docker run --name dev-postgres -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres:11```
* __create database:__ ```docker exec dev-postgres psql -U postgres -c"CREATE DATABASE entertainmentdb" postgres```

#### Change following config in application.properties file to connect to local DB
```
spring.profiles.active=local
```

#### In case of reset flyway table versioning
* __remove postgres instance:__ ```docker rm -f dev-postgres```
* __start a postgres instance:__ ```docker run --name dev-postgres -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres:11```
* __create database:__ ```docker exec dev-postgres psql -U postgres -c"CREATE DATABASE entertainmentdb" postgres```

#### Useful command
* __check if instance is running:__ ```docker ps```
* __list database:__ ```docker exec -it dev-postgres psql -U postgres -c "\list"```
* __list tables:__ ```docker exec -it dev-postgres psql -U postgres -c "\dt"```
* __remove postgres instance:__ ```docker rm -f dev-postgres```
* __remove database:__ ```docker exec dev-postgres psql -U postgres -c"DROP DATABASE entertainmentdb" postgres```
* __to list logs:__ ```docker container logs -f dev-postgres```
* __to describe table:__ ```docker exec -it dev-postgres psql -U postgres -c "\d musics" entertainmentdb```
* __to list contents:__ ```docker exec -it dev-postgres psql -U postgres -c "select * from musics" entertainmentdb```