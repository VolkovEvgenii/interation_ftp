package ru.volkov.integration.ftp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
@ImportResource("classpath:integration_context.xml")
public class FtpApplication implements ApplicationRunner {

    private FileWriterGateway gateway;

    public FtpApplication(FileWriterGateway gateway) {
        this.gateway = gateway;
    }

    public static void main(String[] args) {
        SpringApplication.run(FtpApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        this.gateway.write("text.txt", "test-1");
        this.gateway.read("/EKP/VOLUNTEER/text.txt");
    }
}
