package com.devandre.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogAppBackendApplication.class, args);
    }

    /*Bean to initialize the modelMapper*/
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
