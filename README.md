# Backend for boccarusso.com

# Creating the `jar` file
To check if the overall software run the following command in the command line for then checking if it works using the browser

```
./mvnw spring-boot:run
```

If everything is good then create a package first:

```
./mvnw clean package
```

The runned command will crate a jar file in the target folder named `<projectName>-<version>.jar`
To test the jar file:

```
java -jar ./target/boccarusso-2.0.0.jar
```

## Dockerizing the application

Once the `jar` file is present the `Dockerfile` can work.

```
FROM openjdk:17-jdk-slim

WORKDIR ./app
COPY ./target/boccarusso-2.0.0.jar /app

EXPOSE 8080

CMD ["java", "-jar", "boccarusso-2.0.0.jar"]

```

Once created the `Dockerfile` just two commands are needed to create the image:

```
docker build -t boccarusso .
```

and then run it:

```
docker run -it -p 8080:8080
```
