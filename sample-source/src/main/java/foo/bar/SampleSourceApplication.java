package foo.bar;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;

@SpringBootApplication
public class SampleSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSourceApplication.class, args);
	}

	@EnableBinding(Source.class)
	public static class MySource {

		@Autowired
		Source source;

		@InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay="1000"))
		public String sendUser() {
			return "gh-229-" + UUID.randomUUID().toString();
		}
	}
}
