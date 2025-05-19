# code-with-quarkus-vs

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

HOW TO use this Lab

The steps are designed to build up your knowledge from a simple implementation of an api end point, learning to test, and adding more complex code using objects and a database.
To get the most from this lab.  Follow the steps below and then experiment.  Find your preferred way of working.
1. Set up run configurations in dev mode which enables live coding using (Java version to sdk installed language level 16)
a)If you are setting run configurations use: compile quarkus:dev

b)You can run your using:

```shell script
./mvnw compile quarkus:dev
```

2. Once the application has run and you see the Quarkus banner, type r into the terminal to run the tests.   You will see it says "Profile dev activated. Live Coding activated" These will also run each time you save a file 
3. Open Bruno and open the test folder
You are set up with a simple Hello World type api and a double value function.  Run Bruno query "QuarkusHello"

4. Go into the GreetingResource file and change the message. You will see in the terminal window that the tests re-run When you click ctrl S (or equivalent to save)
You will see a message saying:
   Response body doesn't match expectation.
   Expected: is "Hello Quarkus VS"
   Actual: your_message
> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.
![img.png](img.png)
5. Navigate to this url and explore the menu on the left: Extensions, Configuration, Endpoints, Continous Testing, Dev Services, Read Me, Dependencies
6. Try changing another file to add some comments and save it e.g. //This is a comment
7. In Bruno run all of the tests
![img_1.png](img_1.png)

The next chapters will help you 
Run a Docker Build
Use a simple Database to write some queries

docker build -f src/main/docker/Dockerfile.jvm -t quarkus/code-with-quarkus-vs-jvm .

docker run -i --rm -p 8080:8080 quarkus/code-with-quarkus-vs-jvm

Scrap notes:
git checkout main gets you the maths api
git checkout customer-api gets you the api branch











//Original text


## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-vs-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing Jakarta REST and more

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
