# Spring Data JPA

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

Description : Project using Spring Data JPA & PostgreSQL.

---

<h3>Running the project</h3>

Docker :
- ls into the folder which contains the 'docker-compose.yml' file.
- Type the command docker compose up -d
  - In case of an error like `The container name "/pgadmin" is already in use by ...` ; then do a `docker rm /pgadmin` to remove it.
- Type docker compose ps to see if it is up and running

PostgreSQL :
- Go to your browser and go to 'localhost:5050/browser' (port as found in the 'docker-compose.yml' file) to open pgAdmin.
- Set the master password as 'password'.
- Create a new server.
  - In the form :
    - In the 'General' tab set the name as 'postgres'.
    - Go to 'Connection' tab and set the following properties (which can be cross-checked in the 'docker-compose.yml' file) :
      - Host name = postgres
      - Port = 5432
      - Maintenance database = postgres
      - Username = seebaware
      - Password = password
      - Save password = True