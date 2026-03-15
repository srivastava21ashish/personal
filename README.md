# personal

A Java 8 Maven project.

## Requirements

- Java 8 (JDK 1.8)
- Maven 3.x

## Build

```bash
mvn clean compile
```

## Run

```bash
mvn exec:java -Dexec.mainClass="com.personal.Main"
```

Or after packaging:

```bash
mvn package
java -cp target/personal-1.0-SNAPSHOT.jar com.personal.Main
```

## Test

```bash
mvn test
```
