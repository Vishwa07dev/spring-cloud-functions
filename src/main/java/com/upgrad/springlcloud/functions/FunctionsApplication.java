package com.upgrad.springlcloud.functions;

import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * Created by Vishwa 10th June 2021
 */
@SpringBootApplication
public class FunctionsApplication {

  public static void main(String[] args) {
    SpringApplication.run(FunctionsApplication.class, args);
  }

  /**
   * This function is exposed as a HTTP endpoint
   * @return
   */

  @Bean
  public Function<Integer, Integer> factorial() {

    return value -> fact(value);
  }

  private Integer fact(Integer value) {

    if (value <= 2) {
      return value;
    }
    return value * fact(value - 1);
  }
}
