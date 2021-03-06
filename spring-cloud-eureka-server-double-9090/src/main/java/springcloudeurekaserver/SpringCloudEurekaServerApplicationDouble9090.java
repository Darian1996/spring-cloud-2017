package springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServerApplicationDouble9090 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerApplicationDouble9090.class, args);
	}
}
