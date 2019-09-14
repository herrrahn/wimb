# wimb
Scaffold project set up with Java, Postgres, Docker, Swagger-UI, Spring Boot and Tests

<strong>Steps</strong>

1. create a docker volume (Optional only if you want to keep the data) <br> 
    docker volume create --name vol_bier
    
2. start postgres database <br>
    docker run -p 5432:5432 --rm --name pg_sigaf -v vol_bier:/var/lib/postgresql/data postgres
    
3. generate the package (Maven -> Livecycle -> package)

4. build docker image <br>
    docker build -t wimb .
    
5. run docker image <br>
    docker run -p 8080:8080 --rm -d wimb
     
6. check if is running <br> 
    http://localhost:8080/swagger-ui.html#/ <br>
    or <br>
    curl http://localhost:8080/api/bier/prost
    
7. enjoy :)
