package foo.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class SampleSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSinkApplication.class, args);
	}

	@EnableBinding(Sink.class)
	public static class MySink {

		@StreamListener(Sink.INPUT)
		public void foo(String foo1) {
			System.out.println(foo1);
		}
	}

}
