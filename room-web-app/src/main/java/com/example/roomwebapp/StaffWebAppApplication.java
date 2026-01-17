package com.example.roomwebapp;

import com.example.roomwebapp.data.repository.StaffRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StaffWebAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(StaffWebAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner staffRunner(StaffRepository rp) { // <-- renamed
        return args -> {
            rp.findAll().forEach(System.out::println);
        };
    }
}
