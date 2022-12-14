package customerManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import common.Service.SwaggerConfig;
import common.Service.WebConfig;

@SpringBootApplication
@Import({SwaggerConfig.class, WebConfig.class})
public class Program {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Program.class, args);
    }    
}
