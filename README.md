# jdk15ioperf

```
mvn clean package

/jdk-14.0.2/bin/java -jar target/benchmarks.jar
14947141.173 ops/s

/jdk-15/bin/java -jar target/benchmarks.jar
4086695.509 ops/s

/jdk-15/bin/java -XX:+UseBiasedLocking -jar target/benchmarks.jar
15500264.639 ops/s
```

Not loving https://openjdk.java.net/jeps/374 ...