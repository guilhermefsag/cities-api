# Cities API

## Descrição do Projeto
<p align=>Este projeto consiste em uma API que calcula a distância em milhas ou em metros entre duas cidades. Api desenvolvida no Bootcamp 
NTT DATA Quality Assurance Beginner #3 </p>

## Requisitos para rodar a API:
### • Docker
### • Java 8 (Mínimo)

## Banco de dados
### Postgres

 <a href="https://hub.docker.com/_/postgres">• Postgres Docker Hub</a>

<p align=>Executar o seguinte comando para configurar a imagem do banco de dados no docker (criar banco de dados).</p>


```js  
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```
### Povoar banco de dados

<a href="https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL">• Dados</a>
```js  
Linux: cd ~/workspace/sql-paises-estados-cidades/PostgreSQL
Windows: cd c:\Users\USUARIO\Desktop\sql-paises-estados-cidades\PostgreSQL

Linux: docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash
Windows: docker run -it --rm --net=host -v dir:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```

### Accessar banco de dados

```js

docker exec -it cities-db /bin/bash

psql -U postgres_user_city cities

```

## Endpoints
<p align=>Os endpoints que executam os cálculos são do tipo "Get" <a href="https://github.com/guilhermefsag/cities-api/blob/master/src/main/java/com/github/guilhermefsag/citiesapi/cities/resources/DistanceResource.java"> Classe</a> . Uma Query faz o cálculo em milhas e a outra em metros. Os dados necessários serão passados na própria URL utilizando o "id" das respectivas cidades.</p>

#### Exemplo cálculo em milhas:

```js
  http://localhost:8080/distances/by-points?from=6&to=2
```
#### Exemplo cálculo em metros:

```js
  http://localhost:8080/distances/by-cube?from=6&to=2
```

## Referência do projeto:

 <a href="https://github.com/andrelugomes/digital-innovation-one/tree/master/cities-api"> andrelugomes/digital-innovation-one</a>

