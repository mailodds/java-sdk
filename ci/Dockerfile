FROM docker.io/library/maven:3.9-eclipse-temurin-21
WORKDIR /sdk
COPY . .
# Allow forward-compatible JSON deserialization: ignore unknown fields from the API
# (the generated strict validation rejects responses containing fields not in the model)
RUN find src/main/java -name '*.java' -exec sed -i '/not defined in the.*properties/d' {} +
RUN mvn package -q -Dmaven.test.skip=true
RUN mkdir -p /smoke && javac -cp "target/classes:target/lib/*" -d /smoke ci/SmokeTest.java
CMD ["java", "-cp", "/smoke:target/classes:target/lib/*", "ci.SmokeTest"]
