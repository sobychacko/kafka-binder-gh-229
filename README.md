# kafka-binder-gh-229

* Start Kafka 0.11.*

* `cd sample-source`

* `./mvnw clean package`

* `java -jar target/sample-source-0.0.1-SNAPSHOT.jar --spring.cloud.stream.bindings.output.destination=foobar`

* `cd ../sample-sink`

* `./mvnw clean package`

* `java -jar target/sample-sink-0.0.1-SNAPSHOT.jar --spring.cloud.stream.bindings.input.destination=foobar --server.port=0`

You should see messages coming at the sink console. 
