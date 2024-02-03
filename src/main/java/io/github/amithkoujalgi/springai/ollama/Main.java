package io.github.amithkoujalgi.springai.ollama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    org.springframework.web.client.RestClient x;
    SpringApplication.run(Main.class, args);
  }
}
