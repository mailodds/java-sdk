FROM docker.io/library/maven:3.9-eclipse-temurin-21
WORKDIR /sdk
COPY . .
RUN mvn package -q -DskipTests
RUN mkdir -p /smoke && javac -cp "target/classes:target/lib/*" -d /smoke ci/SmokeTest.java
CMD ["java", "-cp", "/smoke:target/classes:target/lib/*", "ci.SmokeTest"]
